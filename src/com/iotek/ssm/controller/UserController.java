package com.iotek.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("loginPage")
	public String goLoginPage() {
		return "forward:../login.jsp";
	}

	@RequestMapping("registerPage")
	public String goRegisterPage() {
		return "forward:../register.jsp";
	}

	@RequestMapping("register")
	public String register(User user,HttpSession session) {
		user.setType(1);
		userService.addUser(user);
		user=userService.findUserByNameAndPassowrd(user.getUserName(), user.getPassword());
		session.setAttribute("user", user);
		return "tourist";
	}
	
	@RequestMapping("login")
	public String login(String userName,String password,HttpSession session) {
		User user = userService.findUserByNameAndPassowrd(userName, password);
		session.setAttribute("user", user);
		return "tourist";
	}

}
