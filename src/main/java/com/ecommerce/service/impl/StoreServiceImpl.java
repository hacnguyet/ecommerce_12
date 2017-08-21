package com.ecommerce.service.impl;

import java.util.List;
import org.apache.log4j.Logger;
import com.ecommerce.action.ListStoreAction;
import com.ecommerce.dao.StoreDAO;
import com.ecommerce.model.Store;
import com.ecommerce.service.StoreService;

/**
 * Store Service
 * 
 * @author ManhTT 新規作成 2017/08/16
 */
public class StoreServiceImpl implements StoreService {
	
	// Logger
	private static final Logger logger = Logger.getLogger(ListStoreAction.class);

	private StoreDAO storeDAO;
	
	public void setStoreDAO(StoreDAO storeDAO) {
		this.storeDAO = storeDAO;
	}



	@Override
	public List<Store> list() throws Exception {
		try {
			return storeDAO.list();
		} catch (Exception e) {
			logger.error("Threw a Exception in StoreServiceImpl::list, full stack trace follows:", e);
			return null;
		}

	}
}
