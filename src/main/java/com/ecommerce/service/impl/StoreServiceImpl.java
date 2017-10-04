package com.ecommerce.service.impl;

import com.ecommerce.service.StoreService;
import com.ecommerce.model.Store;
import com.ecommerce.dao.StoreDAO;

/**
 * Store Service Impl
 * @author ManhTT 
 * 新規作成 2017/10/02
 */
public class StoreServiceImpl implements StoreService {
	
	private StoreDAO storeDAO;
	
	/** 
	 * Find store by storeName
	 * @param Integer storeId
	 * @return Store store
	 */
	@Override
	public Store findByStoreId(Integer storeId){
		return storeDAO.findByStoreId(storeId);
	}

	public StoreDAO getStoreDAO() {
		return storeDAO;
	}

	public void setStoreDAO(StoreDAO storeDAO) {
		this.storeDAO = storeDAO;
	}

}
