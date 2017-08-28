package com.ecommerce.service.impl;

import org.apache.log4j.Logger;
import com.ecommerce.dao.UserDAO;
import com.ecommerce.model.User;
import com.ecommerce.service.UserService;

/**
 * User Service
 * 
 * @author ManhTT 新規作成 2017/08/25
 */
public class UserServiceImpl implements UserService {
	
	// Logger
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public User getUserByUsername(String userName){
		try {
			return userDAO.getUserByUsername(userName);
		} catch (Exception e) {
			logger.error("Threw a Exception in UserServiceImpl::getUserByUsername, full stack trace follows:", e);
			return null;
		}

	}
}
