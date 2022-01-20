package com.example.demo.test.dao;

import com.example.demo.test.vo.MemberDTO;

public interface MemberDAO {
    MemberDTO loginCheck(String userid, String passwd); //로그인 체크 메소드
    void join(MemberDTO dto); //회원가입처리 함수
}
