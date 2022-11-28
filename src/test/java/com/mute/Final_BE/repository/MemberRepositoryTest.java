package com.mute.Final_BE.repository;
import com.mute.Final_BE.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

// 로그인 테스트 - 도연
@SpringBootTest
@Slf4j
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;
    @Test
    @DisplayName("로그인 테스트")
    public void loginTest() {
        Member member = new Member();
        member.setUser_id("doyeon911");
        member.setPwd("love1234@");
    }
}