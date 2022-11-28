//package com.mute.Final_BE.service;
//import com.mute.Final_BE.dto.MemberDTO;
//import com.mute.Final_BE.entity.Member;
//import com.mute.Final_BE.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import javax.transaction.Transactional;
//import java.util.List;
//
//
//// 로그인 - 도연
//@Service
//@Transactional
//@Slf4j
//public class MemberService {
//    private MemberRepository memberRepository;
//    public MemberService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }
//    public boolean loginCheck(String userId, String pwd) {
//        List<Member> memberList = memberRepository.findByUserIdAndPwd(userId, pwd);
//        for(Member info : memberList) {
//            return true;
//        }
//        return false;
//    }
//
//    // 아이디 찾기 - 도연
////    public String findId(String name, String mail) {
////        List<Member> memberList = memberRepository.findByMail(name, mail);
////        for(Member info : memberList) {
////            return result;
////        }
////        return
////
////    }
////    public MemberDTO getMemberList(String mail) {
////        Member member = memberRepository.findByMail(name, mail);
////        MemberDTO memberDTO = new MemberDTO();
////        memberDTO.setName(member.getName);
////        memberDTO.setMail(member.getMail);
////        return memberDTO;
////    }
//
//
//}
