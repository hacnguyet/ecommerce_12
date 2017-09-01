package com.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.ecommerce.info.CategoryInfo;
import com.ecommerce.model.Category;
import com.ecommerce.dao.CategoryDAO;
import com.ecommerce.service.CategoryService;


/**
 * Category Service Impl
 * @author ManhTT 
 * 新規作成 2017/09/01
 */
public class CategoryServiceImpl implements CategoryService {
	
	private CategoryDAO categoryDAO;

	/** 
	 * List all categories
	 * @param none
	 * @return List<Category> listCategory
	 */
	@Override
	public List<CategoryInfo> getListCategories(){
		List<Category> listCategory =  categoryDAO.getListCategories();
		List<CategoryInfo> listCategoryInfo = new ArrayList<>();
		for (Category category : listCategory) {
			CategoryInfo categoryInfo = new CategoryInfo(category.getCategoryName());
			listCategoryInfo.add(categoryInfo);
		}
		return listCategoryInfo;
	}

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}
	
}
