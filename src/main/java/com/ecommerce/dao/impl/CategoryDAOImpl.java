package com.ecommerce.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.ecommerce.model.Category;
import com.ecommerce.dao.CategoryDAO;

/**
 * Category DaoImpl
 * @author ManhTT
 * 新規作成 2017/09/01
 */
public class CategoryDAOImpl extends HibernateDaoSupport implements CategoryDAO {
	
	private String selectAllCategories = "FROM Category ORDER BY categoryName ASC";
	
	/** 
	 * List all categories
	 * @param none
	 * @return List<Category> listCategory
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getListCategories(){
		return (List<Category>) currentSession().createQuery(selectAllCategories).list();
	};
}
