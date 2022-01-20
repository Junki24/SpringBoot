package com.example.demo.test.service;

import com.example.demo.test.vo.MemberDTO;

public interface MemberService {
    MemberDTO loginCheck(String userid, String passwd);
    void join(MemberDTO dto);
    //dao를 호출하기위한 메소드
}
