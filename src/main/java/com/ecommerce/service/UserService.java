package com.ecommerce.service;

import com.ecommerce.model.User;

/**
 * User Service
 * 
 * @author ManhTT 新規作成 2017/08/25
 */
public interface UserService {
	public User getUserByUsername(String userName);
}
