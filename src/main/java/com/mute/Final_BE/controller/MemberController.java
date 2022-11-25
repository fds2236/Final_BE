package com.mute.Final_BE.controller;
import com.mute.Final_BE.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MemberController {
    // 로그인 - 도연
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> memberLogin(@RequestBody Map<String, String> loginData) {
        String user_id = loginData.get("user_id");
        String pwd = loginData.get("pwd");
        boolean result = memberService.login(user_id, pwd);
        if(result) {
            return new ResponseEntity(true, HttpStatus.OK);
        } else {
            return new ResponseEntity(false, HttpStatus.BAD_REQUEST);
        }
    }

//    //아이디 찾기 - 도연
//    @RequestMapping("/findId")
//    @ResponseBody
//    public String findId(@RequestParam("name") String name, @RequestParam("mail") String mail) {
//        String result = memberService.findId(name, mail);
//        return result;
//    }
}

