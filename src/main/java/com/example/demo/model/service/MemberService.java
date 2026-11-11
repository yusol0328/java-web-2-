package com.example.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.Member;
import com.example.demo.model.dto.MemberForm;
import com.example.demo.model.repository.MemberRepository;
import org.springframework.security.core.userdetails.*; // User, UserDetails 등

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

import com.example.demo.model.repository.PostRepository;
import com.example.demo.model.repository.CommentRepository;

@Service // 서비스 등록
public class MemberService implements UserDetailsService {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired // SecurityConfig 에 등록한 BCryptPasswordEncoder 주입
    private PasswordEncoder passwordEncoder;
    @Autowired // ① 필드 추가
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    public Member signup(MemberForm form) { // 회원가입
        
        if (isBlank(form.getUsername()) || isBlank(form.getPassword()) || isBlank(form.getName())) {
            throw new IllegalArgumentException("아이디, 비밀번호, 이름은 필수입니다.");
        }
       
        if (memberRepository.existsByUsername(form.getUsername())) {
            throw new IllegalArgumentException("이미 사용 중인 아이디입니다.");
        }
        Member member = new Member();
        member.setUsername(form.getUsername());
        member.setPassword(passwordEncoder.encode(form.getPassword())); // ★ 암호화
        member.setName(form.getName());
        member.setRole("USER"); // 기본 권한
        return memberRepository.save(member); // INSERT
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    } // 클래스 아래쪽

    // MemberService : 로그인한 아이디로 회원 조회
    public Member findByUsername(String username) {
        return memberRepository.findByUsername(username)
                .orElseThrow(() -> new IllegalArgumentException(
                        "회원이 존재하지 않습니다 : " + username));
    }

    @Override // 로그인 시 시큐리티가 자동 호출
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Member member = memberRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("회원 없음 : " + username));
        return User.builder() // 시큐리티용 사용자 객체로 변환
                .username(member.getUsername())
                .password(member.getPassword()) // 암호화 값 → matches()로 비교
                .roles(member.getRole()) // USER → ROLE_USER
                .build();
    }

    public List<Member> findAll() { // MemberService : 전체 회원 (id 순서)
        return memberRepository.findAll(Sort.by("id"));
    }

    private static final List<String> ROLES = List.of("USER", "MANAGER", "ADMIN");

    private String currentUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @PreAuthorize("hasRole('ADMIN')") // 관리자만 실행 가능 (2차 잠금)
    public Member changeRole(Long id, String role) { // 권한 변경
        if (!ROLES.contains(role)) { // 허용된 권한만
            throw new IllegalArgumentException("허용되지 않는 권한입니다 : " + role);
        }
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("회원이 존재하지 않습니다."));
        if (member.getUsername().equals(currentUsername())) { // 본인이면 거부
            throw new IllegalArgumentException("자기 자신의 권한은 변경할 수 없습니다.");
        }
        member.setRole(role);
        return memberRepository.save(member); // UPDATE (id 가 있으면 수정)
    }

    @PreAuthorize("hasRole('ADMIN')") // 관리자만 실행 가능 (2차 잠금)
    public void deleteMember(Long id) { // 회원 삭제
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("회원이 존재하지 않습니다."));
        checkNotMe(member); // [6주차 연습문제 1]
        if (postRepository.existsByAuthor(member) || commentRepository.existsByAuthor(member)) {
            throw new IllegalArgumentException("작성한 글이나 댓글이 있는 회원은 삭제할 수 없습니다.");
        }
        memberRepository.delete(member); // DELETE
    }

    public Optional<Member> findById(Long id) {
        return memberRepository.findById(id);
    }

    //검색 메서드 추가 (8주차 연습문제)
    public List<Member> search(String keyword) {
        if (keyword == null || keyword.isBlank()) {
            return findAll(); // 검색어가 없으면 전체 목록
        }
        return memberRepository.findByUsernameContainingOrNameContaining(keyword, keyword);
    }

    //임시 추가 메서드 (cheackNotMe 빨간줄 해결) 
    private void checkNotMe(Member targetMember) {
        // 현재 로그인한 사용자의 username(아이디) 가져오기
        String loginUsername = SecurityContextHolder.getContext().getAuthentication().getName();

        // 대상 회원의 아이디와 로그인한 아이디가 같다면 예외 발생
        if (targetMember.getUsername().equals(loginUsername)) {
            throw new IllegalArgumentException("자기 자신의 권한을 변경하거나 탈퇴시킬 수 없습니다.");
        }
    }

}



