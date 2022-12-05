package com.mute.Final_BE.repository;

import com.mute.Final_BE.entity.ReviewSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewSeatRepository extends JpaRepository<ReviewSeat,Long> {
    // 좌석번호별 개인 후기 전체조회
    List<ReviewSeat> findBySeatNum(int seatNum);

}
