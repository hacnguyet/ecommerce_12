package com.ecommerce.model;

import java.util.Date;
import java.util.List;

/**
 * Category model
 * 
 * @author ManhTT 新規作成 2017/08/10
 */
public class Category {
	// カテゴリーID
	private Integer categoryId;

	// カテゴリー名
	private String categoryName;

	// 作成日
	private Date createAt;

	// 更新日
	private Date updateAt;

	// プロダクトのリスト
	private List<Product> products;

	/* Construction */
	public Category() {

	}

	public Category(Integer categoryId, String categoryName, Date createAt, Date updateAt, List<Product> products) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.products = products;
	}

	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * @return the updateAt
	 */
	public Date getUpdateAt() {
		return updateAt;
	}

	/**
	 * @param updateAt
	 */
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
