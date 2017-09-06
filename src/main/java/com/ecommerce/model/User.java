package com.ecommerce.model;

import java.util.Date;
import java.util.List;

/**
 * User model
 * 
 * @author ManhTT
 * 新規作成 2017/08/07
 */
public class User {
	// ユーザID
	private Integer userId;
	
	// ユーザパスワード
	private String password;
	
	// ユーザ名
	private String userName;
	
	// ユーザタイプ
	private String userType;
	
	// ユーザ性別
	private String userGender;
	
	// ユーザメール
	private String userEmail;
	
	// 電話番号
	private String telNumber;
	
	// 作成日
	private Date createAt;
		
	// 更新日
	private Date updateAt;
	
	//ストアのリスト
	private List<Store> stores;
	
	//お気に入りのリスト
	private List<Favorite> favorites;
	
	//レビューのリスト
	private List<Review> reviews;
	
	//販売履歴のリスト
	private List<Salehistory> saleHistories;
	
	/* Construction */
	public User() {
		
	}
	
	public User(String userName, String userEmail, String password, String userType) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
		this.userType = userType;
	}
	
	public User(Integer userId, String password, String userName, String userType, String userGender, String userEmail, String telNumber, Date createAt, Date updateAt, List<Store> stores, List<Favorite> favorites, List<Review> reviews, List<Salehistory> saleHistories) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userType = userType;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.telNumber = telNumber;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.stores = stores;
		this.favorites = favorites;
		this.reviews = reviews;
		this.saleHistories = saleHistories;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the userGender
	 */
	public String getUserGender() {
		return userGender;
	}

	/**
	 * @param userGender
	 */
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the telNumber
	 */
	public String getTelNumber() {
		return telNumber;
	}

	/**
	 * @param telNumber
	 */
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
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
	 * @return the stores
	 */
	public List<Store> getStores() {
		return stores;
	}

	/**
	 * @param stores
	 */
	public void setStores(List<Store> stores) {
		this.stores = stores;
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
}
