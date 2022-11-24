package com.mute.Final_BE.service;
import com.mute.Final_BE.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.lang.reflect.Member;
import java.util.List;

// 로그인 - 도연
@Service
@Slf4j
public class MemberService {
    private MemberRepository memberRepository;
    public boolean login(String userId, String pwd) {
        List<Member> memberList = memberRepository.findByUserIdAndPwd(userId, pwd);
        for(Member info : memberList) {
            return true;
        }
        return false;
    }

    // 아이디 찾기 - 도연
//    public String findId(String name, String mail) {
//        List<Member> memberList = memberRepository.findByNameAndMail(name, mail);
//        for(Member info : memberList) {
//            return
//        }
//
//    }


}
