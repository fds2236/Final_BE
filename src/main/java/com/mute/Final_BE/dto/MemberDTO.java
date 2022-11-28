package com.mute.Final_BE.dto;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

// 도연 작업중 (수빈, 찬호 확인해주세요)
@Getter @Setter
public class MemberDTO {
    private Long user_num; // 회원번호
    private String user_id; // 회원아이디
    private String pwd; // 비밀번호
    private String name; // 이름
    private String phone; // 전화번호
    private String mail; // 메일
    private String addr; // 주소
    private Date reg_Date; // 가입일
    private Date unreg_Date; // 탈퇴일
    private String is_unreg; // 탈퇴여부
}
