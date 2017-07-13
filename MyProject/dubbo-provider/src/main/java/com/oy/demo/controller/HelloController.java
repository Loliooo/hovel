package com.oy.demo.controller;

import com.oy.demo.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/provider")
public class HelloController {
	@Resource
	MemberService service1;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("111");
		model.addAttribute("message1", service1.print(18570));
		return "hello";
	}
}