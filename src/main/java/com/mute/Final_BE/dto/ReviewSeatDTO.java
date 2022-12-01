package com.mute.Final_BE.dto;

import com.mute.Final_BE.entity.Theater;
import lombok.Data;

import javax.persistence.*;

@Data
public class ReviewSeatDTO {

    private Long indexNum; // pk부여를 위한 인덱스
    private Theater theater;
    private int seatsFloor; // 층(1층,2층,3층)
    private int seatsLine; // 열(가로줄로 1열,2열,3열..)
    private int lowSeat; // 해당 층과 해당 열의 좌석 최저번호
    private int highSeat; // 해당 층과 해당 열의 좌석 최고번호

}
