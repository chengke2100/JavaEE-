package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Apply;

public interface ApplyDao {
	/**
	 * 增加应聘信息
	 * @param apply
	 * @return
	 */
	int insertApply(Apply apply);
	/**
	 * 删除应聘信息
	 * @param applyId
	 * @return
	 */
	int deleteApply(int applyId);
	/**
	 * 查询所有应聘信息
	 * 此方法暂未实现查出apply里的recruit
	 * @return
	 */
	List<Apply> queryAllApplys();
}
