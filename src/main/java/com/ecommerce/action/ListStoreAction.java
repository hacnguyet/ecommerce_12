package com.ecommerce.action;

import java.util.List;
import org.apache.log4j.Logger;
import com.opensymphony.xwork2.ActionSupport;
import com.ecommerce.service.StoreService;
import com.ecommerce.model.Store;

public class ListStoreAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	// Logger
	private static final Logger logger = Logger.getLogger(ListStoreAction.class);
	
	private StoreService storeService;

	private List<Store> listStore;

	public void setStoreService(StoreService storeService) {
		this.storeService = storeService;
	}

	public String execute() {
		try {
			listStore = storeService.list();
		} catch (Exception e) {
			logger.error("Threw a Exception in ListStoreAction::execute, full stack trace follows:", e);
			return null;
		}
		return SUCCESS;
	}

	public List<Store> getListStore() {
		return listStore;
	}
}
