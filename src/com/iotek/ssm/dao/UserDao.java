package com.iotek.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.iotek.ssm.entity.User;

public interface UserDao {
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int insertUser(User user);
	/**
	 * 删除用户(暂未实现)
	 * @param id
	 * @return
	 */
	int deleteUser(int id);
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	User queryUserById(int uid);
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> queryAllUsers();
	/**
	 * 根据姓名和密码查询用户(游客用)
	 * @param name
	 * @param password
	 * @return
	 */
	User queryUserByNameAndPassword1(@Param(value="userName")String name,@Param(value="password")String password);
	/**
	 * 验证用户名是否存在
	 * @param userName
	 * @return
	 */
	Integer queryUserName(String userName);
	
}
