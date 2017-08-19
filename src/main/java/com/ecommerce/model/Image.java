package com.ecommerce.model;

import java.util.Date;

/**
 * Salehistory model
 * 
 * @author ManhTT 新規作成 2017/08/16
 */
public class Image {
	// 写真のID
	private Integer imageId;

	// 写真の色
	private String color;

	// 写真
	private String image;

	// 作成日
	private Date createAt;

	// 更新日
	private Date updateAt;

	// プロダクト
	private Product product;

	/* Construction */
	public Image() {

	}

	public Image(Integer imageId, String color, String image, Date createAt, Date updateAt, Product product) {
		this.imageId = imageId;
		this.color = color;
		this.image = image;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.product = product;
	}

	/**
	 * @return the imageId
	 */
	public Integer getImageId() {
		return imageId;
	}

	/**
	 * @param imageId
	 */
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
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
