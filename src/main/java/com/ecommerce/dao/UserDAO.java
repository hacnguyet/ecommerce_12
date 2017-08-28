package com.ecommerce.dao;

import com.ecommerce.model.User;

/**
 * User Dao
 * @author ManhTT
 * 新規作成 2017/08/25
 */
public interface UserDAO {
	public User getUserByUsername(String userName);
}
