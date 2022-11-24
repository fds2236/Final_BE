package com.mute.Final_BE.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.reflect.Member;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 도연 - 로그인
    List<Member> findByUserIdAndPwd(String user_id, String pwd);
    // 도연 - 아이디 찾기
    Member findByNameAndMail(String name, String mail); // 이메일로 가져오기
}
