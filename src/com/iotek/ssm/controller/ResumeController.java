package com.iotek.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.PositionService;
import com.iotek.ssm.service.ResumeService;

@RequestMapping("resume")
@Controller
public class ResumeController {
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private PositionService positionService;

	@RequestMapping("query")
	public String queryResume(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		Resume resume = resumeService.getResumeByUid(user.getUid());
		model.addAttribute("resume", resume);
		return "tourist";
	}

	@RequestMapping("add")
	public String addResume(Resume resume, Integer resumeId, Integer deptId, Integer pid, HttpSession session,
			Model model) {
		Position position = positionService.getPositionById(pid);
		resume.setPosition(position);
		User user = (User) session.getAttribute("user");
		resume.setUid(user.getUid());
		System.out.println(resume);
		if (resumeId == null) {
			resumeService.addResume(resume);
		} else {
			resume.setRid(resumeId);
			resumeService.updateResume(resume);
		}
		model.addAttribute("resume", resume);
		return "tourist";
	}
}
