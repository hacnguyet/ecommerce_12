package com.ecommerce.model;

import java.util.Date;

/**
 * Salehistory model
 * 
 * @author ManhTT 新規作成 2017/08/16
 */
public class Salehistory {
	// 販売履歴のID
	private Integer saleHistoryId;

	// 販売履歴の状態
	private String saleHistoryStatus;

	// 作成日
	private Date createAt;

	// 更新日
	private Date updateAt;

	// ユーザ
	private User user;

	// プロダクト
	private Product product;

	/* Construction */
	public Salehistory() {

	}

	public Salehistory(Integer saleHistoryId, String saleHistoryStatus, Date createAt, Date updateAt, User user, Product product) {
		this.saleHistoryId = saleHistoryId;
		this.saleHistoryStatus = saleHistoryStatus;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.user = user;
		this.product = product;
	}

	/**
	 * @return the saleHistoryId
	 */
	public Integer getSaleHistoryId() {
		return saleHistoryId;
	}

	/**
	 * @param saleHistoryId
	 */
	public void setSaleHistoryId(Integer saleHistoryId) {
		this.saleHistoryId = saleHistoryId;
	}

	/**
	 * @return the saleHistoryStatus
	 */
	public String getSaleHistoryStatus() {
		return saleHistoryStatus;
	}

	/**
	 * @param saleHistoryStatus
	 */
	public void setSaleHistoryStatus(String saleHistoryStatus) {
		this.saleHistoryStatus = saleHistoryStatus;
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
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
}
