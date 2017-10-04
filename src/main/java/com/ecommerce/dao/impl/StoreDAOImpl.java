package com.ecommerce.dao.impl;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.ecommerce.model.Store;
import com.ecommerce.dao.StoreDAO;

/**
 * Store DaoImpl
 * @author ManhTT
 * 新規作成 2017/10/02
 */
public class StoreDAOImpl extends HibernateDaoSupport implements StoreDAO {
	
	private String findByStoreIdHQL = "FROM Store WHERE storeId = :storeId";
	
	/** 
	 * Find store by storeId
	 * @param Integer storeId
	 * @return Store store if success, null if fail
	 */ 
	@Override
	public Store findByStoreId(Integer storeId) {
		Query query = currentSession().createQuery(findByStoreIdHQL);
		query.setParameter("storeId", storeId);
		return (Store) query.uniqueResult();
	}
}
