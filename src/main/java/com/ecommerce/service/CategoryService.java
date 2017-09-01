package com.ecommerce.service;

import java.util.List;
import com.ecommerce.info.CategoryInfo;

/**
 * Category Service
 * @author ManhTT 
 * 新規作成 2017/09/01
 */
public interface CategoryService {
	public List<CategoryInfo> getListCategories();
}
