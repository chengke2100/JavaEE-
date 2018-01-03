package com.iotek.ssm.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.dao.UserDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml","classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class TestDepartmentDao {
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private PositionDao positionDao;
	
	@Test
	public void testinsertDepartment() {
		Department department = new Department(-1, "销售部", new Date(), null);
		Position position = new Position(-1, "销售主管", department, new Date(), null);
		User user = new User(-1, "aaa", "111", 1, new Date(), department, position, null);
		List<User> users = new ArrayList<>();
		users.add(user);
		position.setUsers(users);
		List<Position> positions = new ArrayList<>();
		positions.add(position);
		department.setPositions(positions);
		int res1 = positionDao.insertPosition(position);
		System.out.println(res1);
		int res2 = departmentDao.insertDepartment(department);
		System.out.println(res2);
	}
	
	@Test
	public void testqueryUserById() {
		User user = userDao.queryUserById(1);
		user.setUserName("kska");
		int res = userDao.updateUser(user);
		System.out.println(res);
	}
	
	@Test
	public void testqueryUserByNameAndPassword() {
		User user = userDao.queryUserByNameAndPassword1("Tom", "12342132");
		System.out.println(user);
	}
	
	@Test
	public void testqueryAllUsers() {
		List<User> users = userDao.queryAllUsers();
		System.out.println(users);
	}
}
