package com.ecommerce.action;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.ecommerce.service.CategoryService;
import com.ecommerce.service.ProductService;
import com.ecommerce.service.UserService;
import com.ecommerce.service.StoreService;
import com.ecommerce.info.ProductInfo;
import com.ecommerce.info.UserInfo;
import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.model.Store;

/**
 * Product Action
 * @author ManhTT
 * 新規作成 2017/09/20
 */
public class ProductAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	private ProductService productService;
	private CategoryService categoryService;
	private StoreService storeService;
	
	//Received info
	private String userName;
	private String password;
	private Integer productId;
	private String productName;
	private Integer storeId;
	private Integer categoryId;
	private String property;
	private Float price;
	private Integer count;
	private Float discount;
	private Date updateAt;
	private String categoryName;
	
	public String create() {
		try {
			//Check if login info exists
			if(StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
				return ERROR;
			}
			
			//Check if login info is correct
			UserInfo userInfo = userService.findByUsername(userName);
			if(userInfo == null)
				return ERROR;
			if(!userInfo.getPassword().equals(password))
				return ERROR;
			
			Category category = categoryService.findByCategoryId(categoryId);
			if(category == null)
				return ERROR;
			Store store = storeService.findByStoreId(storeId);
			if(store == null)
				return ERROR;
			
			//Create new product
			ProductInfo productInfo = new ProductInfo(productName, property, count, price, discount, category, store);
			Product product = productService.create(productInfo);
			if(product == null) {
				System.out.println("null");
				return ERROR;
			}	
			productId = product.getProductId();
			updateAt = product.getUpdateAt();
			categoryName = product.getCategory().getCategoryName();
		} catch (Exception e) {
			System.out.println("exception");
			return ERROR;
		}
		return SUCCESS;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public StoreService getStoreService() {
		return storeService;
	}

	public void setStoreService(StoreService storeService) {
		this.storeService = storeService;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
