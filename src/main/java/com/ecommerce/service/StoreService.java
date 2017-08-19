package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Store;

/**
 * Store Service
 * 
 * @author ManhTT 新規作成 2017/08/16
 */
public interface StoreService {
	public List<Store> list() throws Exception;
}
