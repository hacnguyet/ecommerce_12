package com.ecommerce.action;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ecommerce.common.Constant;
import com.ecommerce.service.UserService;
import com.ecommerce.service.CategoryService;
import com.ecommerce.service.ProductService;
import com.ecommerce.info.UserInfo;
import com.ecommerce.info.CategoryInfo;
import com.ecommerce.info.ProductInfo;

/**
 * Shop Action
 * @author ManhTT
 * 新規作成 2017/09/08
 */
public class StoreAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	private ProductService productService;
	private CategoryService categoryService;
	
	private String userName;
	private String password;
	private Integer storeId;
	
	private List<ProductInfo> listProductInfo;
	private List<CategoryInfo> listCategoryInfo;
	
	public String manageProducts() {
		// Get session
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		// Check if user is not logged in, redirect to login page
		if (session.get("userName") == null) 
			return Constant.LOGIN;
		
		// Check user's privilege
		UserInfo userInfo = userService.findByStoreId(storeId);
		if(!session.get("userName").equals(userInfo.getUserName())) 
			return Constant.LOGIN;
		
		userName = userInfo.getUserName();
		password = userInfo.getPassword();
		
		//Get list of products
		listProductInfo = productService.findByStoreId(storeId);
		
		//Get list of categories
		listCategoryInfo = categoryService.getListCategories();
		
		return SUCCESS;
	}

	public List<CategoryInfo> getListCategoryInfo() {
		return listCategoryInfo;
	}

	public void setListCategoryInfo(List<CategoryInfo> listCategoryInfo) {
		this.listCategoryInfo = listCategoryInfo;
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

	public List<ProductInfo> getListProductInfo() {
		return listProductInfo;
	}

	public void setListProductInfo(List<ProductInfo> listProductInfo) {
		this.listProductInfo = listProductInfo;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
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

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

}
