package com.iotek.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("user")
public class UserController {
	@RequestMapping("loginPage")
	public String goLoginPage() {
		return "forward:../login.jsp";
	}
	
	@RequestMapping("registerPage")
	public String goRegisterPage() {
		return "forward:../register.jsp";
	}
}
