package com.ecommerce.dao.impl;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.ecommerce.model.User;
import com.ecommerce.dao.UserDAO;

/**
 * User DAO Impl
 * @author ManhTT
 * 新規作成 2017/08/25
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	
	private String findByStoreIdHQL = "SELECT user FROM User as user INNER JOIN user.stores as store WHERE store.storeId = :storeId";
	
	/** 
	 * Create new user
	 * @param String userName, String email, String password
	 * @return user
	 */
	@Override
	public User create(User user) {
		getHibernateTemplate().save(user);
		return user;
	}
	
	/** 
	 * Find user by userId
	 * @param Integer userId
	 * @return user if success, null if fail
	 */ 
	@Override
	public User findByUserId(Integer userId) {
		return findByUserId(userId, false);
	}

	public User findByUserId(Integer userId, boolean lock) {
		Query query = currentSession().getNamedQuery("User.SelectUserByUserId");
		if (lock)
			query.setLockMode("User", LockMode.WRITE);
		query.setParameter("userId", userId);
		return (User) query.uniqueResult();
	}

	/** 
	 * Get user by userName
	 * @param String userName
	 * @return user if success, null if fail
	 */ 
	@Override
	public User findByUsername(String userName) {
		Query query = currentSession().getNamedQuery("User.SelectUserByUsername");
		query.setParameter("userName", userName);
		return (User) query.uniqueResult();
	}
	
	/** 
	 * Get user by user's email
	 * @param String email
	 * @return user if success, null if fail
	 */ 
	@Override
	public User findByEmail(String userEmail) {
		Query query = currentSession().getNamedQuery("User.SelectUserByEmail");
		query.setParameter("userEmail", userEmail);
		return (User) query.uniqueResult();
	}
	
	/** 
	 * Get user by storeId
	 * @param Integer storeId
	 * @return user if success, null if fail
	 */ 
	@Override
	public User findByStoreId(Integer storeId) {
		Query query = currentSession().createQuery(findByStoreIdHQL);
		query.setParameter("storeId", storeId);
		return (User) query.uniqueResult();
	}
}
