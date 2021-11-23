package com.example.demo.test.controller;

import com.example.demo.test.vo.TestVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping(value = "/home")
    public String home() {
        return "index.html";
    }

    @ResponseBody
    @RequestMapping(value = "/valueTest")
    public String valueTest() {
        String value = "test String";
        return value;
    }

    @RequestMapping("/test")
    public ModelAndView test() throws Exception {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "junkiHong");

        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        return mav;
    }

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model) {
        TestVo testModel = new TestVo("jjjjunki", "junki Hong");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }
}
