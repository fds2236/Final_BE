package com.mute.Final_BE.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "review_musical") // 뮤지컬 후기 테이블
public class ReviewMusical {
    @Id
    @GeneratedValue
    private Long reviewMuId; // 뮤지컬후기 글 번호

//    @ManyToOne
//    @JoinColumn(name = "musical_id")
//    private

//    @OneToOne
//    @JoinColumn(name = "user_num")
}
