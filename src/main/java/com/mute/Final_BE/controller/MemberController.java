//package com.mute.Final_BE.controller;
//import com.mute.Final_BE.dto.MemberDTO;
//import com.mute.Final_BE.service.MemberService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//public class MemberController {
//    // 로그인 - 도연
//
//    private MemberService memberService;
//
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<Boolean> memberLogin(@RequestBody Map<String, String> loginData) {
//        String userId = loginData.get("userId");
//        String pwd = loginData.get("pwd");
//        boolean result = memberService.loginCheck(userId, pwd);
//        if (result) {
//            return new ResponseEntity(true, HttpStatus.OK);
//        } else {
//            return new ResponseEntity(false, HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    //아이디 찾기 - 도연
////    @RequestMapping("/GetMember")
////    public String findId(@RequestParam("name") String name, @RequestParam("mail") String mail) {
////        String result = memberService.findId(name, mail);
////        return result;
////    }
////    public ResponseEntity<List<MemberDTO>> memberList(@RequestParam String mail) {
////        MemberDTO memberDTO = memberService.getMemberList(mail);
////        return new ResponseEntity<>(memberDTO,
////
////    }
//}
//
