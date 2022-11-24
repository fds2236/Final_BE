package com.mute.Final_BE.service;

import java.lang.reflect.Member;
import java.util.List;

public class MemberService {
    // 로그인 - 도연
    public boolean loginCheck(String user, String pwd) {
        List<Member> memberInfoList = memberRepository.findByUserIdAndPwd(user, pwd);
        for(Member e : memberInfoList) {
            return true;
        }
        return false;
    }

}
