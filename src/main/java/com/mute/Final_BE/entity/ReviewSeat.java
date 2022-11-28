package com.mute.Final_BE.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "review_seat") // 좌석별 후기 테이블
public class ReviewSeat {
    @Id
    @GeneratedValue
    private Long reviewSeId; // 좌석후기 글 번호
}
