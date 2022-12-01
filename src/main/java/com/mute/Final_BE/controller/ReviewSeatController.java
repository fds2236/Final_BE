package com.mute.Final_BE.controller;

import com.mute.Final_BE.dto.ReviewSeatDTO;
import com.mute.Final_BE.service.ReviewSeatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/review-seat")
public class ReviewSeatController {

    private ReviewSeatService reviewSeatService;
    public ReviewSeatController(ReviewSeatService reviewSeatService) {
        this.reviewSeatService = reviewSeatService;
    }

//    @PostMapping("/get-seat-review/list")
//    public ResponseEntity<List<ReviewSeatDTO>> getSeatReview() {
//
//        List<ReviewSeatDTO> list = reviewSeatService.loginCheck(userId, pwd);
//        return 0;
//
//    }

//    @PostMapping("/get-seat-review")
//    public Integer getSeatReview(@RequestBody String seatNum) {
//        String userId = loginData.get("userId");
//        String pwd = loginData.get("pwd");
//        System.out.println("아이디 패스워드 확인 : "+userId + " " + pwd);
//        Integer result = reviewSeatService.loginCheck(userId, pwd);
//        return result;
//    }
}
