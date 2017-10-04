package com.ecommerce.info;

import java.util.Date;
import java.util.List;
import com.ecommerce.model.Category;
import com.ecommerce.model.Favorite;
import com.ecommerce.model.Image;
import com.ecommerce.model.Product;
import com.ecommerce.model.Review;
import com.ecommerce.model.Salehistory;
import com.ecommerce.model.Store;

/**
 * Product Info
 * @author ManhTT
 * 新規作成 2017/09/08
 */
public class ProductInfo {

	private Integer productId;
	private String productName;
	private String property;
	private Integer count;
	private Float price;
	private Float discount;
	private Date createAt;
	private Date updateAt;
	private Store store;
	private Category category;
	private List<Salehistory> saleHistories;
	private List<Favorite> favorites;
	private List<Review> reviews;
	private List<Image> images;
	
	public ProductInfo() {}
	
	public ProductInfo(String productName, String property, Integer count, Float price, Float discount, Category category, Store store) {
		this.productName = productName;
		this.property = property;
		this.count = count;
		this.price = price;
		this.discount = discount;
		this.category = category;
		this.store = store;
	}
	
	public ProductInfo(Product product) {
		this.productId = product.getProductId();
		this.productName = product.getProductName();
		this.property = product.getProperty();
		this.count = product.getCount();
		this.price = product.getPrice();
		this.discount = product.getDiscount();
		this.createAt = product.getCreateAt();
		this.updateAt = product.getUpdateAt();
		this.store = product.getStore();
		this.category = product.getCategory();
		this.saleHistories = product.getSaleHistories();
		this.favorites = product.getFavorites();
		this.reviews = product.getReviews();
		this.images = product.getImages();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Salehistory> getSaleHistories() {
		return saleHistories;
	}

	public void setSaleHistories(List<Salehistory> saleHistories) {
		this.saleHistories = saleHistories;
	}

	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
	
}
