package com.community.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory =null;

	
	public Session getSession(){
		
		Session session=sessionFactory.getCurrentSession();
		return session;
	}
}
