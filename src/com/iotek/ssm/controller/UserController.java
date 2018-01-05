package com.iotek.ssm.controller;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.DepartmentService;
import com.iotek.ssm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("loginPage")
	public String goLoginPage() {
		return "forward:../login.jsp";
	}

	@RequestMapping("registerPage")
	public String goRegisterPage() {
		return "forward:../register.jsp";
	}

	@RequestMapping("register")
	public String register(User user, HttpSession session) {
		user.setType(1);
		userService.addUser(user);
		return "redirect:user/login";
	}

	@RequestMapping("login")
	public String login(Model model, String userName, String password, HttpSession session) {
		User user = userService.findUserByNameAndPassowrd(userName, password);
		if (user != null) {
			session.setAttribute("user", user);
			List<Department> departments = departmentService.findAllDepartments();
			model.addAttribute("departments", departments);
			return "tourist";
		}
		model.addAttribute("error", "error");
		return "forward:../login.jsp";
	}
	
	
	@RequestMapping(value="positions",produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getPositions(Integer did) {
		Department department = departmentService.getDepartmentById(did);
		Set<Position> src = department.getPositions();
		String positions = JSON.toJSONString(src);
		return positions;		
	}

}
