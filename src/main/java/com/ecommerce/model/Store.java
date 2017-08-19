package com.ecommerce.model;

import java.util.Date;
import java.util.List;

/**
 * Store model
 * 
 * @author ManhTT
 * 新規作成 2017/08/07
 */
public class Store{
	// ストアーID
	private Integer storeId;
	
	// ストアー名
	private String storeName;
	
	// ストアーアドレス
	private String storeAddress;
	
	// 作成日
	private Date createAt;
	
	// 更新日
	private Date updateAt;
	
	// ユーザ
	private User user;
	
	//プロダクのリスト
	private List<Product> products;
	
	/* Construction */
	public Store() {
		
	}
	
	public Store(Integer storeId, String storeName, String storeAddress, Date createAt, Date updateAt, User user, List<Product> products) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.user = user;
		this.products = products;
	}

	/**
	 * @return the storeId
	 */
	public Integer getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId
	 */
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	/**
	 * @return the storeAddress
	 */
	public String getStoreAddress() {
		return storeAddress;
	}

	/**
	 * @param storeAddress
	 */
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
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
