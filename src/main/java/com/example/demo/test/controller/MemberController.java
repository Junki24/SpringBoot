package com.example.demo.test.controller;

import com.example.demo.test.service.MemberService;
import com.example.demo.test.vo.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member/*")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("login.do")
    public ModelAndView login(){
        return new ModelAndView("member/login");
    }

    //회원가입페이지에서 회원가입 내용을 다 작성한뒤 버튼을 누르면 맵핑되는 메소드
    //dto에 회원정보를 저장하고, Service에 값을 전달함

    @RequestMapping("member_join.do")
    public String member_join(String _id, String passwd
            , String name) {
        MemberDTO dto=new MemberDTO();
        dto.set_id(_id);
        dto.setPasswd(passwd);
        dto.setName(name);
        memberService.join(dto); //mongodb에 insert됨
        return "redirect:/member/login.do"; //로그인 화면으로 이동
    }

    @RequestMapping("logout.do")
    public String logout(HttpSession session) {

        //세션 정보 초기화
        session.invalidate();

        //로그인 페이지로 이동
        return "redirect:/member/login.do";
    }
}
