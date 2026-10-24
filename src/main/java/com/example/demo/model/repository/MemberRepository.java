package com.example.demo.model.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.domain.Member;
import java.util.List;

@Repository // 리포지토리 등록
public interface MemberRepository extends JpaRepository<Member, Long> {
    // SELECT * FROM member WHERE username = ?
    Optional<Member> findByUsername(String username);

    // 아이디 중복 확인 (존재하면 true)
    boolean existsByUsername(String username);

    //검색 메서드 추가 (8주차 연습문제)
    List<Member> findByUsernameContainingOrNameContaining(String username, String name);
}