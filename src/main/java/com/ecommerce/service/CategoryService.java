package com.ecommerce.service;

import java.util.List;
import com.ecommerce.info.CategoryInfo;
import com.ecommerce.model.Category;

/**
 * Category Service
 * @author ManhTT 
 * 新規作成 2017/09/01
 */
public interface CategoryService {
	public List<CategoryInfo> getListCategories();
	public Category findByCategoryId(Integer categoryId);
}
