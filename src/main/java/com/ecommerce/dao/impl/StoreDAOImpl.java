package com.ecommerce.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.model.Store;
import com.ecommerce.dao.StoreDAO;

public class StoreDAOImpl implements StoreDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public StoreDAOImpl() {
	}

	public StoreDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Store> list() {
		@SuppressWarnings("unchecked")
		List<Store> listStore = (List<Store>)
			sessionFactory.getCurrentSession().createCriteria(Store.class, "outer")
				.createAlias("user", "user")
				.createAlias("products", "product")
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
				.list();
		return listStore;
	}
}
