package com.mute.Final_BE.entity;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

// 도연 작업중 (수빈, 찬호 확인해주세요)

@Data
@Entity
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_num; // 회원번호 - pk
    @Column(unique = true)
    private String user_id; // 회원아이디
    private String pwd; // 비밀번호
    private String name; // 이름
    @Column(unique = true)
    private String phone; // 전화번호
    @Column(unique = true)
    private String mail; // 메일
    private String addr; // 주소
    private LocalDateTime reg_Data; // 가입일
    private LocalDateTime unreg_Data; // 탈퇴일
    private String is_unreg; // 탈퇴여부

}
