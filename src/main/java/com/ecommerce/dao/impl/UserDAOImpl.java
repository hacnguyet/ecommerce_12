package com.ecommerce.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.ecommerce.model.User;
import com.ecommerce.dao.UserDAO;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	
	// Logger
	private static final Logger logger = Logger.getLogger(UserDAOImpl.class);

	@Override
	public User getUserByUsername(String userName) {
		try {
			return (User) currentSession().createCriteria(User.class).add(Restrictions.eq("userName", userName)).uniqueResult();
		} catch (Exception e) {
			logger.error("Threw a Exception in UserDAOImpl::getUserByUsername, full stack trace follows:", e);
			return null;
		}
	}
}
