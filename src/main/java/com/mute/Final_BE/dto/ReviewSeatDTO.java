package com.mute.Final_BE.dto;

import com.mute.Final_BE.entity.Theater;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
public class ReviewSeatDTO {
    private Long reviewMuId; // 뮤지컬 후기 글 번호
    private String theaterId; // 공연장 ID
    private String musicalId; // 공연 ID
    private Long memberNum; // 회원 고유번호
    private String userId; // 회원 ID
    private int seatId; // 좌석번호
    private LocalDateTime writeDate; // 작성일
    private int scoreSeat; // 좌석 별점
    private int scoreView; // 시야 별점
    private int scoreSound; // 음향 별점
    private int scoreLight; // 조명 별점
    private double scoreAvg; // 평균 좌석 별점
    private String reviewSeTxt; // 좌석 후기 내용

}
