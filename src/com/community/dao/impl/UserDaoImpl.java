package com.community.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.community.bean.User;
import com.community.dao.BaseDao;
import com.community.dao.UserDao;
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao {

	
	@Override
	public User getUser(String id) {
		
		String hql = "from User u where u.id=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, id);
		
		return (User)query.uniqueResult();
	}

	@Override
	public List<User> getAllUser() {
		
		String hql = "from User";
		Query query = getSession().createQuery(hql);
		
		return query.list();
	}

	@Override
	public void addUser(User user) {
		getSession().save(user);
	}

	@Override
	public boolean delUser(String id) {
		
		String hql = "delete User u where u.id = ?";
		Query query =getSession().createQuery(hql);
		query.setString(0, id);
		
		return (query.executeUpdate() > 0);
	}

	@Override
	public boolean updateUser(User user) {
		
		String hql = "update User u set u.userName = ?,u.age=? where u.id = ?";
		Query query = getSession().createQuery(hql);
		query.setString(0, user.getUserName());
		query.setString(1, user.getAge());
		query.setString(2, user.getId());
		
		return (query.executeUpdate() > 0);
	}

}
