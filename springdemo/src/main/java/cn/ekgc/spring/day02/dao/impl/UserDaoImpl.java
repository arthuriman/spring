package cn.ekgc.spring.day02.dao.impl;

import java.util.Date;

import cn.ekgc.spring.day02.dao.UserDao;

public class UserDaoImpl implements UserDao {

	public void saveUser() {
		System.out.println("UserDao saveUser()..." + new Date());
	}
}
