
## 0주차 | 대표 내용 틀

### 실행 내용

### 학습 기록

### 연습문제 


## 2주차 | 스프링 부트 개발환경, 테스트 완료

### 실행 내용
1. VSCode에서 스프링 부트 개발 환경 구축
2. 기본 화면 실행 (index.html 실행 및 수정 완료)

### 학습 기록
스프링을 쉽게 사용할 수 있게 해주는 스프링 부트의 기반을 다졌고, 웹 구조화 및 요청 처리 방식을 코드 실습을 통해 익힐 수 있었다.

### 실제 동작 과정
1. 내장 톰캣이 웹페이지를 실행
2. Spring IoC 컨테이너가 자바 객체(빈)들을 관리
3. 서블릿이 프론트 컨트롤러 역할을 수행
4. Thymeleaf가 서버 측에서 HTML을 렌더링하여 응답

### 연습문제 
URL 매핑과 컨트롤러 추가하기 
1. 컨트롤러에 맵핑을 추가 (hello2 메서드)
<img src="/images/assignment/자바_2주차_1.png" width="400">
2. hello.html 링크를 수정하여 hello2.html로 이어지게 만듦 
<img src="/images/assignment/자바_2주차_2.png" width="400">
3. hello2.html을 작성하고, Thymeleaf(th:text) 문법을 이용해 컨트롤러에서 전달한 5개 속성 값을 서버 렌더링 시점에 동적으로 출력하도록 구현
<img src="/images/assignment/자바_2주차_3.png" width="400">

컨트롤러에서 뷰로 데이터를 전달하고 렌더링하는 요청 처리 흐름을 직접 실습을 통해 이해할 수 있었음.


## 3주차 | 웹 호스팅 알기, 포트폴리오 작성하기 

### 실행 내용
1. 개인 포트폴리오 화면 추가, 프로필 정보 업데이트 
    - 부트스트랩 5 기반 디자인 
2. 포트폴리오 화면 텍스트 & 아이콘 수정 
3. 포트폴리오 화면 하위 페이지 추가 

### 학습 기록
1. Thymeleaf 문법 익히기 
    - 상대경로 설정들을 절대 경로 또는 thymeleaf로 수정 
2. URL 접근 방식의 차이 알기 (일반 페이지 요청 / 컨트롤러)

### 연습문제 
1. 프로필 수정하기 (하위 페이지 추가)
    - detailed_ai.html과 detailed_game.html, detailed_security.html을 추가로 삽입하여 하위 페이지를 늘렸다. 
<img src="/images/assignment/자바_3주차_1.png" width="400">
<img src="/images/assignment/자바_3주차_2.png" width="400">
<img src="/images/assignment/자바_3주차_3.png" width="400">
2. 성능 확인(원인 분석)
    - Lighthouse 성능 분석을 통해 Pc/모바일에서의 결과를 비교해 보았다.
    - PC/모바일 모두 가장 성능을 감소시킨 항목은 Performance였고, 두 번째로 감소시킨 항목은 SEO였다. 
    - PC 
        <img src="/images/assignment/자바_3주차_5.png" width="400">
    - 모바일 
        <img src="/images/assignment/자바_3주차_4.png" width="400">
    - 둘의 성능에 차이가 나는 이유는 모바일 테스트는 느린 4G 및 CPU감속이 걸렸기 때문이고, 데스크탑은 그렇지 않았기 때문으로 비춰진다. 


## 4주차 | 프로필 수정하기(추가), 데이터베이스 연동 

### 실행 내용
1. 메인 화면에 개인 포트폴리오 화면을 추가하며 자신의 색을 부여했다. 
2. 데이터베이스를 연동하여 테스트 페이지로 정보를 관리해 보았다. 

### 학습 기록
1. 위 프로젝트에서 데이터베이스는 쿼리가 아닌 메서드(자바 코드)로 제어했다. 
2. 데이터베이스의 구조(테이블)을 작성하여 제어 기능과 로직을 익혔다.  

### 연습문제 
1. 오늘의 문법 사용하기 (test.db 수정), th:each로 tr 반복처리 
    - 사용자를 직접 추가하여 INSERT, RUN을 실행해 입력한 키와 이름을 확인했다. 
         <img src="/images/assignment/자바_4주차_1.png" width="400">
2. 사용자 추가 및 출력하기 
    - 나이, 성별, 칼럼을 추가하여 정보를 세부화했다.
    - 각 사용자의 정보를 DB에서 직접 추가하여 테스트를 적용해 보았다. 
        <img src="/images/assignment/자바_4주차_1.png" width="400">


## 5주차 | 로그인 / 로그아웃 구현, 비밀번호 암호화 

### 실행 내용
1. 로그인/로그아웃 기능을 추가한다. 
2. 로그인 전/ 로그인 후 페이지를 구현한다.  

### 학습 기록
1. SecurityConfig에서 폼 로그인, 로그아웃에 대하여 세션과 쿠키 삭제를 설정하는 방법을 익혔다. 
    - student 1로 로그인 했을 시의 쿠키값 
        <img src="/images/assignment/자바_5주차_1.png" width="400">
    - 로그아웃 이후의 쿠키값
        <img src="/images/assignment/자바_5주차_3.png" width="400">
    - 로그아웃 안내문 명시 
        <img src="/images/assignment/자바_5주차_2.png" width="400">
2. 로그인 여부에 따라 로그인 버튼 또는 ID님+로그아웃을 명시하기 위하여 'sec:authorize'를 활용했다. 

### 연습문제 
1. 로그인 상태 유지 
    - 세션 쿠키로 사용자를 기억시키고, 설정한 기간 동안 유지되게끔 했다.
         <img src="/images/assignment/자바_5주차_4.png" width="400">
2. 비밀번호 확인 검증 
    - 회원가입 시에 password와 passwordConfirm을 비교하여 같고 다름을 비교했다. 
        <img src="/images/assignment/자바_5주차_5.png" width="400">
    - DB에는 설정되지 않도록 했다. 
        <img src="/images/assignment/자바_5주차_6.png" width="400">


## 6주차 | 권한 관리 및 관리자 페이지 

### 실행 내용
1. 용도에 따른 권한을 나누고(User, Manager, Admin), 권한에 따라 접근할 수 있는 페이지를 구분했다. (접근 제어)
2. 관리자의 페이지를 별도로 분리하여 기능이 관리자에 한할 수 있도록 추가적인 설정을 더했다. 

### 학습 기록
1. SecurityConfig에서 hasRole("ADMIN")을 이용하여 일반 user가 회원관리 페이지에 들어가면 403으로 막히도록 설정했다. 
    - user의 회원관리 페이지 접근 권한 X 
        <img src="/images/assignment/자바_6주차_1.png" width="400">
2. /mypage는 Principal로 아이디를 받아 findByUsername으로 회원 정보를 조회해 보여준다. 메뉴는 sec:authorize로 로그인했을 때만 보이게 했다.  
    - 내 정보 페이지(USER)
        <img src="/images/assignment/자바_6주차_2.png" width="400">
    - ADMIN 배지 표시 
        <img src="/images/assignment/자바_6주차_3.png" width="400">
3. 회원관리 페이지를 구성했다. 권한 드롭다운과 삭제 버튼을 배치했다. @PreAuthorize("hasRole('ADMIN')")를 붙여 컨트롤러 밖에서도 한번 더 잠기도록 2차 방어를 적용했다. 
    - 회원관리 페이지 
        <img src="/images/assignment/자바_6주차_4.png" width="400">

### 연습문제 
1. 관리자 권한 보호 
    - 관리자가 자기 권한을 강등시키거나 자기 계정을 삭제했을 시 관리자가 0명이 되는 문제를 막기 위해 IllegalArgumentException을 이용했다. 
    - 관리자 권한 변경 불가 추가설정 
        <img src="/images/assignment/자바_6주차_7.png" width="400">
    - 관리자 권한 계정 삭제 불가 추가설정 
        <img src="/images/assignment/자바_6주차_8.png" width="400">
2. 매니저 권한 추가 
    - 매니저 역할을 추가하고 회원관리 페이지의 드롭다운에도 옵션을 넣어 부여했다. 매니저는 회원 목록은 볼 수 있으나 회원관리 페이지에는 접근할 수 없다. 
    - 매니저 배지 표시 
        <img src="/images/assignment/자바_6주차_5.png" width="400">
    - 매니저 회원관리 페이지 접근 권한 x 
        <img src="/images/assignment/자바_6주차_6.png" width="400">
3. 회원목록 메뉴도 USER에게 숨기기 
    - sec:authorize를 index.html의 회원목록에 설정해 변경했다. 


## 8주차 | 회원 관리 REST API(JSON)

### 실행 내용
1. 회원 관리 REST API 만들기
    - 1단계 : 첫 API 를 만들어 JSON 응답 확인
        - 첫 API(/api/hello)를 호출한 결과, {"message": "안녕하세요, REST API!", ...} 를 확인함 
        <img src="/images/assignment/자바_8주차_3.png">
    - 2단계 : 내 정보 API 만들기 (문제 1 : 비밀번호 노출)
        - 문제 1: /api/me의 응답에 패스워드가 그대로 노출됨 
        <img src="/images/assignment/자바_8주차_1.png">
    - 3단계 : DTO반환으로 해결 (문제 1 : 비밀번호 노출)
        - DTO로 바꾼 뒤 id, username, name, role만 나오도록 변경 
        <img src="/images/assignment/자바_8주차_2.png">

2. Postman 으로 테스트하기
    - 4단계 : Postman 으로 호출하기 (문제 ② 로그인 화면 응답)
        - 포스트맨으로 /api/me를 호출하여 200 OK 를 확인 
        <img src="/images/assignment/자바_8주차_4.png">
    - 5~7단계 : 관리자 API 만들기 (조회 -> 등록 -> 변경, 삭제)
        - 5단계 : 관리자 API 조회 | GET
            - 관리자 API 조회 - GET /api/admin/members (admin, 200 OK, 회원 목록)
            <img src="/images/assignment/자바_8주차_6.png">
            - 관리자 계정으로 다른 회원 단일 조회 (200 ok)
            <img src="/images/assignment/자바_8주차_7.png">
            - student1(일반 사용자)로 관리자 API 호출 (403 Forbidden, 권한 없음)
            <img src="/images/assignment/자바_8주차_5.png">
        - 6단계 : 회원 등록하기 | POST | 201, 400
            - 관리자 계정으로 접속해 등록 테스트
            - '포스트맨'이라는 유저 계정 등록 (201 created)
            <img src="/images/assignment/자바_8주차_8.png">
            - '포스트맨'이라는 유저 중복 등록 불가능 메시지 (400 bad request)
            <img src="/images/assignment/자바_8주차_8(2).png">
            - 유저 이름만 등록, 필수값 누락 메시지 (400 bad request)
            <img src="/images/assignment/자바_8주차_8(3).png">
         - 7단계 : 권한 변경 및 삭제 | PATCH, DELETE | 200, 400, 403, 204
            - 권한 변경, 3번 계정 student1이 관리자 권한으로 변경됨 (200 ok)
            <img src="/images/assignment/자바_8주차_9.png">
            - 권한 변경 불가능 메세지 (400 bad request)
            <img src="/images/assignment/자바_8주차_9(2).png">
            - 관리자 권한으로 계정 삭제 (204 No content)
            <img src="/images/assignment/자바_8주차_9(3).png">
            - 유저 계정으로 다른 계정 삭제 불가능 (403 Forbidden)
            <img src="/images/assignment/자바_8주차_9(4).png">

        - 8단계 : 제공 화면에 우리 API 연결하기
             - 제공 화면(/admin/members-api)에서 목록, 조회(9999 -> 404), HTTP 요청 및 응답 확인
             <img src="/images/assignment/자바_8주차_10.png">

### 학습 기록
1. REST API는 화면(HTML) 대신 JSON 데이터를 주고받으며, 상태 코드(200, 201, 400, 403, 404, 405)로 결과를 표현한다는 것을 배웠다.
2. 엔티티를 그대로 반환하면 password 같은 민감 정보가 노출되므로, DTO(MemberResponse)로 필요한 필드만 내려줘야 한다.
3. ResponseEntity로 201 Created, 204 No Content, 400 Bad Request 등 상태 코드를 직접 지정할 수 있다.
4. 메서드에 @PatchMapping을 빠뜨리면 404가 나고, 메서드(GET/POST)가 안 맞으면 405가 나는 것을 직접 겪었다.
5. Postman에서 Basic Auth를 설정해 일반 사용자(403)와 관리자(200)의 권한 차이를 확인했다.

### 연습문제 
1. 회원 검색 API
    - GET /api/admin/members?keyword=student 호출 시 아이디/이름에 student가 포함된 회원만 조회됨 (200 OK)
    - @RequestParam(required = false) 와 findByUsernameContainingOrNameContaining 사용
    <img src="/images/assignment/자바_8주차_11.png">
2. 오류 처리 한 곳에 모으기 
    - 컨트롤러의 반복되던 try-catch를 제거하고, @RestControllerAdvice(ExceptionController)에서 IllegalArgumentException을 400 + {"error": "..."}로 한 번에 처리
    - 제거 전과 동일한 결과가 나오는 것을 확인
        - 관리자 계정으로 자기 자신의 권한 변경 불가능 
        <img src="/images/assignment/자바_8주차_12.png">
        - 아이디, 비밀번호 누락 시 등록 불가능 
        <img src="/images/assignment/자바_8주차_12(2).png">
        - 이미 사용중인 아이디는 등록 불가능 
        <img src="/images/assignment/자바_8주차_12(3).png">
        - 일반 계정으로 허용되지 않는 권한 
        <img src="/images/assignment/자바_8주차_12(4).png">


## 중간고사 시험 정리

구글 문서에 따로 정리하던 내용을 정리해 옮겼습니다. 

### 2주차 ppt 공부
1. 트렌드
   - 스프링 부트의 등장
     - 스프링 프레임워크 1.0 (2004년, XML 기반 설정으로 진입 장벽이 높음)
     - 스프링 부트 (2014년 등장, 작은 규모와 단순한 서블릿 관리가 핵심, 자바/JVM 위에서 실행)
     - 자동 환경설정, 자동 빌드·리로드 같은 편의 기능 강화
   - 전자정부 표준프레임워크 (eGov)
     - 2010년 이후 스프링 기반 공개 (최신 5.x 버전이 존재하나 기존 4.3.x가 대부분)
     - 국내 공공기관 웹 프로젝트 요구 기술 (자바, JSP, jQuery, eGov, 최근 스프링 부트 지원 시작)
     - 본 수업 환경: IntelliJ/Eclipse 대신 VS Code 사용
2. 개발 환경 설정 (실습)
   - 새 프로젝트 만들기
     - VS Code에서 Ctrl+Shift+P를 누르고 "spring maven" 입력
     - 버전 4.x, 패키징 Jar, 언어 Java, 자바 버전 25 설정
     - 필수 의존성 7가지 선택 (Spring Boot DevTools, Lombok, Spring Web, Spring Web services, Thymeleaf, Spring Data JPA, MYSQL Driver)
     - 폴더 경로에 한글 사용 금지
   - Maven 폴더 구조
     - src/main/java: 루트 패키지 경로
     - resources/static: CSS, 이미지, JS 파일을 두는 곳
     - resources/templates: HTML 템플릿 파일을 두는 곳
     - test: 테스트 코드 폴더
     - pom.xml: 빌드 및 의존성 설정 파일
3. 동작 과정과 개념
   - Tomcat (톰캣)
     - 스프링 부트에 내장된 WAS (Web Application Server, 동적 웹 페이지를 만들어 주는 서버)
     - 자바 기반 동적 웹 페이지를 실행하는 오픈소스
   - Spring 컨테이너 및 MVC 패턴
     - 자바 객체 생성·초기화·호출·종료 관리 및 의존성 주입(DI) 제공
     - DispatcherServlet: 프론트 컨트롤러 역할 수행 (URI 요청 전달 및 Thymeleaf 렌더링)
     - MVC 패턴: Model(데이터 저장), View(화면 구성), Controller(흐름 제어)
   - Thymeleaf 템플릿 엔진
     - HTML 기반 템플릿 엔진 (레거시 JSP 대비 장점)
     - 주요 문법: 선언 (<html xmlns:th="http://www.thymeleaf.org">), 텍스트 출력 (<span th:text="${data}"></span>), 주석 등
4. GitHub 연동
   - README.md 작성 후 스테이징(+, Commit, Push)을 통한 형상 관리

### 3주차 ppt 공부
1. 웹 호스팅 및 기술 스택
   - 일반 웹 호스팅(카페24 등) vs 맞춤형(VPS, 클라우드) 환경 비교
   - 배포 환경 구성 및 최종 견적서 작성의 중요성
2. 개인 포트폴리오 템플릿 (실습)
   - TemplateMo 578 (First Portfolio) 템플릿 활용 및 static/templates 폴더 구조화
   - Thymeleaf 자원 경로 수정 (th:href, th:src, @{...} 문법 적용)
3. 프로필 및 기술 수정
   - Hero 섹션 내 개인 소개 및 프로필 이미지(profile.png) 연동
   - Bootstrap Icons를 활용한 기술 스택 아이콘 교체 및 상세 페이지 연결 (target="_blank", rel="noopener noreferrer" 적용)

### 4주차 ppt 공부
1. 데이터베이스 및 MySQL 연동
   - RDB (MySQL) 및 ORM(JPA) 개념 도입
   - application.properties 설정 (spring.datasource.*, spring.jpa.*)
   - VS Code MySQL 확장을 통한 DB 관리 및 SQL 템플릿 활용
2. 계층별 패키지 구조 (MVC)
   - controller, model/domain, model/service, model/repository 계층 분리
   - JpaRepository를 상속받은 Repository를 통한 기본 CRUD 및 메서드 쿼리 구현

### 5주차 ppt 공부
1. 웹 보안 및 인증
   - OWASP Top 10 주요 항목 (접근 제어 실패, 인증 실패)
   - 비밀번호 저장: 일방향 해시 알고리즘 및 BCrypt 적용 (자동 솔트 및 느린 해시 기반 무차별 대입 방어)
   - 세션 기반 로그인 및 Spring Security 필터 체인 구조 이해
2. Spring Security 실습 및 구현
   - SecurityConfig 설정: PasswordEncoder, SecurityFilterChain 정의 (permitAll(), anyRequest().authenticated(), formLogin())
   - 회원가입(DTO, Service 암호화 처리) 및 로그인 연동 (UserDetailsService 구현)
   - 로그아웃 설정 및 Thymeleaf 시큐리티 익스텐션 활용 (sec:authorize, sec:authentication)

### 6주차 ppt 공부
1. 권한 관리 및 인가 (Authorization)
   - RBAC (Role-Based Access Control) 및 최소 권한 원칙
   - URL 기반 권한 제어 (.requestMatchers("/admin/**").hasRole("ADMIN"))와 메서드 기반 보안 (@EnableMethodSecurity, @PreAuthorize)
2. 관리자 페이지 및 예외 처리
   - 관리자 전용 AdminController 구현 및 권한 변경·삭제 기능 (화이트리스트 기반 역할 검증)
   - PRG 패턴 (Post-Redirect-Get) 적용 및 403 접근 거부 페이지 처리

### 7주차 ppt 공부
1. REST API 및 JSON
   - SSR vs CSR (React/Vue) 비교 및 REST 설계 원칙 (GET, POST, PATCH, DELETE)
   - @RestController와 객체-JSON 자동 변환
2. API 보안 및 응답 최적화
   - DTO(MemberResponse, RoleRequest)를 통한 민감 정보(비밀번호 해시) 노출 방지
   - Spring Security HTTP Basic 인증 적용 및 CSRF 예외 처리 (/api/**)
   - HTTP 상태 코드 (200 OK, 201 Created, 204 No Content, 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found) 활용

## 스프링 부트 및 백엔드 이론

1. 자바 및 JVM 환경
   - Java Virtual Machine: 바이트코드 실행, JIT 컴파일, 플랫폼 독립성 및 자동 메모리 관리(GC) 제공
   - 빌드 및 패키징: Maven 및 Gradle 기반 의존성 관리와 Jar 패키징
2. 웹 아키텍처 및 통신
   - 클라이언트-서버 구조: Browser -> Tomcat(WAS) -> Spring Boot -> Database 흐름
   - 시큐리티 필터 체인: 요청이 컨트롤러에 도달하기 전 보안 필터 통과 (CSRF, 인증, 인가 검사)
3. 데이터베이스와 ORM
   - JPA / Hibernate: 객체와 관계형 DB 테이블 간의 매핑을 자동화하고 영속성 컨텍스트를 통해 트랜잭션 관리
   - 커넥션 풀(HikariCP): 효율적인 데이터베이스 커넥션 관리

## 스프링 부트 및 시큐리티 문법 / 용어

1. 주요 어노테이션
   - @SpringBootApplication: 스프링 부트 자동 설정 및 컴포넌트 스캔 활성화
   - @Controller / @RestController: HTML 뷰 반환 컨트롤러와 JSON API 컨트롤러 구분
   - @GetMapping / @PostMapping / @PatchMapping / @DeleteMapping: HTTP 요청 메서드 매핑
   - @Entity, @Table, @Id, @GeneratedValue: JPA 엔티티 및 기본키 매핑
   - @Autowired: 스프링 빈 의존성 주입 (DI)
   - @PreAuthorize: 메서드 실행 전 보안 권한 검사
2. Thymeleaf 문법
   - th:text: 텍스트 데이터 바인딩
   - th:href / th:src: 동적 URL 및 자원 경로 매핑 (@{...})
   - th:each: 반복문 처리
   - sec:authorize / sec:authentication: 시큐리티 권한별 화면 제어 및 사용자 정보 출력
3. 예외 및 에러 처리
   - ResponseEntity: HTTP 상태 코드와 응답 본문을 함께 제어하는 객체
   - IllegalArgumentException: 잘못된 인자 전달 시 발생하는 예외 처리 및 400 Bad Request 반환