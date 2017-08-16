package com.ecommerce.model;

import java.util.Date;
import java.util.List;

/**
 * Product model
 * 
 * @author ManhTT 新規作成 2017/08/10
 */
public class Product {
	// プロダクトID
	private Integer productId;

	// プロダクト名
	private String productName;

	// プロダクトのプロパティ
	private String property;

	// プロダクト数
	private Integer count;

	// プロダクト価格
	private Float price;

	// プロダクトディスカウント
	private Float discount;

	// 作成日
	private Date createAt;

	// 更新日
	private Date updateAt;

	// ストア
	private Store store;

	// カテゴリー
	private Category category;

	// 販売履歴のリスト
	private List<Salehistory> saleHistories;

	// お気に入りのリスト
	private List<Favorite> favorites;

	// レビューのリスト
	private List<Review> reviews;

	// 写真のリスト
	private List<Image> images;

	/* Construction */
	public Product() {

	}

	public Product(Integer productId, String productName, String property, Integer count, Float price, Float discount, Date createAt, Date updateAt, Store store, Category category, List<Salehistory> saleHistories, List<Favorite> favorites, List<Review> reviews, List<Image> images) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.property = property;
		this.count = count;
		this.price = price;
		this.discount = discount;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.store = store;
		this.category = category;
		this.saleHistories = saleHistories;
		this.favorites = favorites;
		this.reviews = reviews;
		this.images = images;
	}

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId 
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the property
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * @param property 
	 */
	public void setProperty(String property) {
		this.property = property;
	}

	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count 
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price 
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public Float getDiscount() {
		return discount;
	}

	/**
	 * @param discount
	 */
	public void setDiscount(Float discount) {
		this.discount = discount;
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
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}

	/**
	 * @param store 
	 */
	public void setStore(Store store) {
		this.store = store;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the saleHistories
	 */
	public List<Salehistory> getSaleHistories() {
		return saleHistories;
	}

	/**
	 * @param saleHistories
	 */
	public void setSaleHistories(List<Salehistory> saleHistories) {
		this.saleHistories = saleHistories;
	}

	/**
	 * @return the favorites
	 */
	public List<Favorite> getFavorites() {
		return favorites;
	}

	/**
	 * @param favorites 
	 */
	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews 
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @param images 
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}
	
}
