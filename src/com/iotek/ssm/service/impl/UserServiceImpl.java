package com.iotek.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.UserDao;
import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public int addUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public User findUserByNameAndPassowrd(String userName, String password) {
		return userDao.queryUserByNameAndPassword1(userName, password);
	}

}
