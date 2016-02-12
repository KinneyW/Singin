package com.lib.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.dao.*;
import com.lib.entity.*;

@Service
public class UserManager{
	
	@Autowired
	public UserDao userDao;
	private User user;
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	// 判断登陆	
	public int checkLogin(int id,String pwd) {
		
		user = userDao.findUserById(id);
		if (user == null) {
			return -1;// 账号不存在
		}
		if (!pwd.equals(user.getuPassword())) {
			return 0;// 密码错误
		}

		
		return 1;
	}
	
	// 获取个人所有签到
	public List<Record> getAllRecordsById(int id) {
		List<Record> records = userDao.findAllRecordsById(id);
		return records;
		
	}
}
