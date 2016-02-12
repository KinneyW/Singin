package com.lib.test;

import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lib.entity.Record;
import com.lib.entity.User;

public class TestSSH {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	private ApplicationContext ctx = null;
	
	@Test
	public void testDataSource() throws SQLException {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//System.out.println(ctx);
		DataSource dataSource = ctx.getBean(DataSource.class);
		//System.out.println(dataSource.getConnection().toString());
		
		SessionFactory sessionFactory = ctx.getBean(SessionFactory.class);
		//System.out.println(sessionFactory);
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		User user = new User("nishizhu","123");
		session.save(user);
		//session.get(Record.class, 1);
		//String hql = "from Record where u_id=1";
		//Query query = session.createQuery(hql);
		//query.setParameter(0, 1);
		tx.commit();
		session.close();
	}

}
