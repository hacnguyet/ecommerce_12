package com.ecommerce.info;

import java.util.Date;
import java.util.List;

import com.ecommerce.model.Favorite;
import com.ecommerce.model.Review;
import com.ecommerce.model.Salehistory;
import com.ecommerce.model.Store;
import com.ecommerce.model.User;

/**
 * User Info
 * @author ManhTT
 * 新規作成 2017/08/31
 */
public class UserInfo {
	
	private Integer userId;
	private String password;
	private String confirm_password;
	private String userName;
	private String userType;
	private String userGender;
	private String userEmail;
	private String telNumber;
	private Date createAt;
	private Date updateAt;
	private List<Store> stores;
	private List<Favorite> favorites;
	private List<Review> reviews;
	private List<Salehistory> saleHistories;
	
	//Construction
	public UserInfo() {}
	
	public UserInfo(String userName) {
		this.userName = userName;
	}
	
	public UserInfo(User user) {
		this.userId = user.getUserId();
		this.password = user.getPassword();
		this.userName = user.getUserName();
		this.userType = user.getUserType();
		this.userGender = user.getUserGender();
		this.userEmail = user.getUserEmail();
		this.telNumber = user.getTelNumber();
		this.createAt = user.getCreateAt();
		this.updateAt = user.getUpdateAt();
		this.stores = user.getStores();
		this.favorites = user.getFavorites();
		this.reviews = user.getReviews();
		this.saleHistories = user.getSaleHistories();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
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

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
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

	public List<Salehistory> getSaleHistories() {
		return saleHistories;
	}

	public void setSaleHistories(List<Salehistory> saleHistories) {
		this.saleHistories = saleHistories;
	}
	
}
