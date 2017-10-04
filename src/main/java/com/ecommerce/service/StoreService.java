package com.ecommerce.service;

import com.ecommerce.model.Store;

/**
 * Store Service
 * @author ManhTT 
 * 新規作成 2017/10/02
 */
public interface StoreService {
	public Store findByStoreId(Integer storeId);
}
