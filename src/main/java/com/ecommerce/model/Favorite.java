package com.ecommerce.model;

import java.util.Date;

/**
 * Favorite model
 * 
 * @author ManhTT 新規作成 2017/08/10
 */
public class Favorite {
	// お気に入りID
	private Integer favoriteId;

	// 評価
	private Integer rating;

	// 作成日
	private Date createAt;

	// 更新日
	private Date updateAt;

	// ユーザ
	private User user;
	
	// プロダクト
	private Product product;

	/* Construction */
	public Favorite() {
			
		}
	
	public Favorite(Integer favoriteId, Integer rating, Date createAt, Date updateAt, User user, Product product) {
		super();
		this.favoriteId = favoriteId;
		this.rating = rating;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.user = user;
		this.product = product;
	}

	/**
	 * @return the favoriteId
	 */
	public Integer getFavoriteId() {
		return favoriteId;
	}

	/**
	 * @param favoriteId
	 */
	public void setFavoriteId(Integer favoriteId) {
		this.favoriteId = favoriteId;
	}

	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
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
