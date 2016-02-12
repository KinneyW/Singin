package com.lib.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.lib.entity.*;

@Repository
public class UserDao {

	@Autowired
	public SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	// 通过id查找user
	public User findUserById(int id) {

		User user = (User) getSession().get(User.class,id);
		return user;
	}

	// 通过姓名查找user
	public User findUserByName(String name) {

		User user = (User) getSession().get(User.class, name);
		return user;
	}
	
	// 通过id查找某人的所有签到记录
	public List<Record> findAllRecordsById(int id) {		
		String hql = "from Record where uid=:id";
		Query query = getSession().createQuery(hql);
		query.setParameter("id", id);
		
		List<Record>  recordList= query.list();
		return recordList;
		
	}

}