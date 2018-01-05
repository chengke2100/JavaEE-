package com.iotek.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.ResumeService;
@Service("ResumeService")
public class ResumeServiceImpl implements ResumeService {
	@Autowired
	private ResumeDao resumeDao;
	@Override
	public int addResume(Resume resume) {
		return resumeDao.insertResume(resume);
	}

	@Override
	public int updateResume(Resume resume) {
		return resumeDao.updateResume(resume);
	}

	@Override
	public Resume getResumeById(int rid) {
		return resumeDao.queryResumeById(rid);
	}

	@Override
	public Resume getResumeByUid(int uid) {
		return resumeDao.queryResumeByUid(uid);
	}

}
