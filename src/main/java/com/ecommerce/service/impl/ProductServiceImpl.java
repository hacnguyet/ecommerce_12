package com.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.ecommerce.info.ProductInfo;
import com.ecommerce.service.ProductService;
import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;

/**
 * Product Service Impl
 * @author ManhTT 
 * 新規作成 2017/09/08
 */
public class ProductServiceImpl implements ProductService {
	// Logger
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	private ProductDAO productDAO;
	
	/** 
	 * List all products
	 * @param Integer storeId
	 * @return List<ProductInfo> listProductInfo
	 */
	@Override
	public List<ProductInfo> findByStoreId(Integer storeId){
		List<Product> listProduct = productDAO.findByStoreId(storeId);
		List<ProductInfo> listProductInfo = new ArrayList<>();
		for (Product product : listProduct) {
			ProductInfo productInfo = new ProductInfo(product);
			listProductInfo.add(productInfo);
		}
		return listProductInfo;
	}
	
	/** 
	 * Create new product
	 * @param ProductInfo productInfo
	 * @return new Product if success, null if fail
	 */
	@Override
	public Product create(ProductInfo productInfo) throws Exception {
		try {
			Product product = new Product(productInfo);
			return productDAO.create(product);
		} catch (Exception e) {
			logger.error("Threw a Exception in ProductServiceImpl::create, full stack trace follows:", e);
			return null;
		}
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
}
