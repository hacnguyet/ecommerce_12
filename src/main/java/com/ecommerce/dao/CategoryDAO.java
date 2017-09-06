package com.ecommerce.dao;

import java.util.List;
import com.ecommerce.model.Category;

/**
 * Category Dao
 * @author ManhTT
 * 新規作成 2017/09/01
 */
public interface CategoryDAO {
	public List<Category> getListCategories();
}
