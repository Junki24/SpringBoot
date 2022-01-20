package com.example.demo.test.service;

import com.example.demo.test.dao.MemberDAO;
import com.example.demo.test.vo.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberDAO memberDao;

    @Override
    public MemberDTO loginCheck(String userid, String passwd){
        return memberDao.loginCheck(userid, passwd);
    }
    @Override
    public void join(MemberDTO dto){
        memberDao.join(dto);
    }
}
