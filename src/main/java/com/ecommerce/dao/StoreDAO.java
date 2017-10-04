package com.ecommerce.dao;

import com.ecommerce.model.Store;

/**
 * Store Dao
 * @author ManhTT
 * 新規作成 2017/10/02
 */
public interface StoreDAO {
	public Store findByStoreId(Integer storeId);
}
