package com.ecommerce.model;

import java.util.Date;

/**
 * Review model
 * 
 * @author ManhTT 新規作成 2017/08/10
 */
public class Review {
	// レビューりID
	private Integer reviewId;

	// 内容
	private String content;

	// 作成日
	private Date createAt;

	// 更新日
	private Date updateAt;

	// ユーザ
	private User user;
	
	// プロダクト
	private Product product;

	/* Construction */
	public Review() {
			
		}
	
	public Review(Integer reviewId, String content, Date createAt, Date updateAt, User user, Product product) {
		super();
		this.reviewId = reviewId;
		this.content = content;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.user = user;
		this.product = product;
	}

	/**
	 * @return the reviewId
	 */
	public Integer getReviewId() {
		return reviewId;
	}

	/**
	 * @param reviewId
	 */
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
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
