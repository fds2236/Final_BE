package com.mute.Final_BE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Member;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByUserIdAndPwd(String user, String pwd);
    Member findByUserId(String user); // userId로 가져오기
}
