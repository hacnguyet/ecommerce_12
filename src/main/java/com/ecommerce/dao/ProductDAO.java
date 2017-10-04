package com.ecommerce.dao;

import java.util.List;
import com.ecommerce.model.Product;

/**
 * Product Dao
 * @author ManhTT
 * 新規作成 2017/09/12
 */
public interface ProductDAO {
	public List<Product> findByStoreId(Integer storeId);
	public Product create(Product product);
}
