package com.iotek.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.iotek.ssm.entity.User;

public interface UserDao {
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	int insertUser(User user);
	/**
	 * ɾ���û�(��δʵ��)
	 * @param id
	 * @return
	 */
	int deleteUser(int id);
	/**
	 * �޸��û�
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @return
	 */
	User queryUserById(int uid);
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	List<User> queryAllUsers();
	/**
	 * ���������������ѯ�û�(�ο���)
	 * @param name
	 * @param password
	 * @return
	 */
	User queryUserByNameAndPassword1(@Param(value="userName")String name,@Param(value="password")String password);
	
}