package com.mute.Final_BE.service;
import com.mute.Final_BE.repository.MemberRepository;
import java.lang.reflect.Member;
import java.util.List;

// 로그인 - 도연

public class MemberService {
    private MemberRepository memberRepository;
    public boolean loginCheck(String userId, String pwd) {
        List<Member> memberList = memberRepository.findByUserIdAndPwd(userId, pwd);
        for(Member info : memberList) {
            return true;
        }
        return false;
    }

}
