package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Recruit;

public interface RecruitDao {
	/**
	 * 添加招聘信息
	 * @param recruit
	 * @return
	 */
	int insertRecruit(Recruit recruit);
	/**
	 * 修改招聘信息
	 * @param recruit
	 * @return
	 */
	int updateRecruit(Recruit recruit);
	/**
	 * 根据id查询招聘信息
	 * @param recruitId
	 * @return
	 */
	Recruit queryRecruitById(int recruitId);
	/**
	 * 根据招聘状态查询招聘信息
	 * @param status(0/1)0代表已被关闭的招聘，1代表正在招聘
	 * @return
	 */
	List<Recruit> queryRecruitsByStatus(int status);
}
