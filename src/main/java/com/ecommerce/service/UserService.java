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
	public UserInfo findByUserId(Integer userId);
	public UserInfo findByUsername(String userName);
	public UserInfo findByEmail(String userEmail);
	public UserInfo findByStoreId(Integer storeId);
}
