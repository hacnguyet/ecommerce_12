package com.ecommerce.info;

/**
 * Category Info
 * @author ManhTT
 * 新規作成 2017/09/06
 */
public class CategoryInfo {
	
	private Integer categoryId;
	private String categoryName;
	
	// Construction
	public CategoryInfo(){}
	
	public CategoryInfo(Integer categoryId, String categoryName){
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
