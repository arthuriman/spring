package cn.ekgc.spring.day02.service.impl;

import java.util.Date;

import cn.ekgc.spring.day02.dao.UserDao;
import cn.ekgc.spring.day02.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void saveUser() {
		System.out.println("UserService saveUser()..." + new Date());
		userDao.saveUser();
	}

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
