package com.iotek.ssm.service;

import com.iotek.ssm.entity.User;

public interface UserService {
	int addUser(User user);
	
	User findUserByNameAndPassowrd(String userName,String password);

	Boolean isReapat(String userName);

	int updateUser(User user);
}
