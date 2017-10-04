package com.ecommerce.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.ecommerce.model.Category;
import com.ecommerce.dao.CategoryDAO;

/**
 * Category DaoImpl
 * @author ManhTT
 * 新規作成 2017/09/01
 */
public class CategoryDAOImpl extends HibernateDaoSupport implements CategoryDAO {
	
	private String getListCategoriesHQL = "FROM Category ORDER BY categoryName ASC";
	private String findByCategoryIdHQL = "FROM Category WHERE categoryId = :categoryId";
	
	/** 
	 * List all categories
	 * @param none
	 * @return List<Category> listCategory
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getListCategories(){
		return (List<Category>) currentSession().createQuery(getListCategoriesHQL).list();
	};
	
	/** 
	 * Find category by categoryName
	 * @param String categoryName
	 * @return Category category if success, null if fail
	 */ 
	@Override
	public Category findByCategoryId(Integer categoryId) {
		Query query = currentSession().createQuery(findByCategoryIdHQL);
		query.setParameter("categoryId", categoryId);
		return (Category) query.uniqueResult();
	}
}
