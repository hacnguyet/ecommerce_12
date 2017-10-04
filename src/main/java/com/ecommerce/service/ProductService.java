package com.ecommerce.service;

import java.util.List;
import com.ecommerce.info.ProductInfo;
import com.ecommerce.model.Product;

/**
 * Product Service
 * @author ManhTT 
 * 新規作成 2017/09/08
 */
public interface ProductService {
	public List<ProductInfo> findByStoreId(Integer storeId);
	public Product create(ProductInfo productInfo) throws Exception;
}
