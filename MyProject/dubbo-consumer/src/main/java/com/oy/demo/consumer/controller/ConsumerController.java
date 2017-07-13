package com.oy.demo.consumer.controller;

import com.oy.demo.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by oy on 2017/7/6.
 */
@Controller
@RequestMapping("/consumer")
public class ConsumerController {
    @Resource
    MemberService service1;
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        System.out.println("222");
        model.addAttribute("message", service1.print(18570));
        return "test";
    }
}
