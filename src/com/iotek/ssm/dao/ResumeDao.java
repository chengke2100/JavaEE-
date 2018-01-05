package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Resume;

public interface ResumeDao {
	/**
	 * 添加简历
	 * @param resume
	 * @return
	 */
	int insertResume(Resume resume);
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
	Resume queryResumeById(int rid);
	/**
	 * 根据用户id查询简历
	 * @param uid
	 * @return
	 */
	Resume queryResumeByUid(int uid);
}
