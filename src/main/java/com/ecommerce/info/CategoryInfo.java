package com.ecommerce.info;

/**
 * Category Info
 * @author ManhTT
 * 新規作成 2017/09/06
 */
public class CategoryInfo {
	
	private String categoryName;
	
	// Construction
	public CategoryInfo(){}
	
	public CategoryInfo(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
