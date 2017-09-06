package com.ecommerce.service;

import com.ecommerce.info.UserInfo;
import com.ecommerce.model.User;

/**
 * User Service
 * @author ManhTT 
 * 新規作成 2017/08/25
 */
public interface UserService {
	public User create(UserInfo userInfo) throws Exception;
	public User findByUserId(Integer userId);
	public User findByUsername(String userName);
	public User findByEmail(String userEmail);
}
