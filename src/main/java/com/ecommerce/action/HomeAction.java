package com.ecommerce.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.ecommerce.info.CategoryInfo;
import com.ecommerce.service.CategoryService;

/**
 * Homepage Action
 * @author ManhTT
 * 新規作成 2017/08/16
 */
public class HomeAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private CategoryService categoryService;
	
	private List<CategoryInfo> listCategory;
	
	public String execute() {
		// Select all categories
		listCategory = categoryService.getListCategories();
		return SUCCESS;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public List<CategoryInfo> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<CategoryInfo> listCategory) {
		this.listCategory = listCategory;
	}

}
