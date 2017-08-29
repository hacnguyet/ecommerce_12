package com.ecommerce.service.impl;

import org.apache.log4j.Logger;
import com.ecommerce.common.Constant;
import com.ecommerce.dao.UserDAO;
import com.ecommerce.model.User;
import com.ecommerce.info.UserInfo;
import com.ecommerce.service.UserService;

/**
 * User Service Impl
 * @author ManhTT 
 * 新規作成 2017/08/25
 */
public class UserServiceImpl implements UserService {
	// Logger
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	private UserDAO userDAO;
	
	@Override
	public User create(UserInfo userInfo) throws Exception {
		try {
			User user = new User(userInfo.getUserName(), userInfo.getUserEmail(), userInfo.getPassword(), Constant.USER);
			return userDAO.create(user);
		} catch (Exception e) {
			logger.error("Threw a Exception in UserServiceImpl::create, full stack trace follows:", e);
			return null;
		}
	}
	
	@Override
	public User findByUserId(Integer userId) {
		return userDAO.findByUserId(userId);
	}

	@Override
	public User findByUsername(String userName){
		return userDAO.findByUsername(userName);
	}
	
	@Override
	public User findByEmail(String userEmail){
		return userDAO.findByEmail(userEmail);

	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
