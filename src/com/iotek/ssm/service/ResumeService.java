package com.iotek.ssm.service;

import com.iotek.ssm.entity.Resume;

public interface ResumeService {
	/**
	 * 添加简历
	 * @param resume
	 * @return
	 */
	int addResume(Resume resume);
	/**
	 * 修改简历
	 * @param resume
	 * @return
	 */
	int updateResume(Resume resume);
	/**
	 * 根据id查询简历
	 * @param rid
	 * @return
	 */
	Resume getResumeById(int rid);
	/**
	 * 根据用户id查询简历
	 * @param uid
	 * @return
	 */
	Resume getResumeByUid(int uid);
}
