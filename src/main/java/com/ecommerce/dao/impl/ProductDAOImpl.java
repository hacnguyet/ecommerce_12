package com.ecommerce.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.ecommerce.model.Product;
import com.ecommerce.dao.ProductDAO;

/**
 * Product DaoImpl
 * @author ManhTT
 * 新規作成 2017/09/12
 */
public class ProductDAOImpl extends HibernateDaoSupport implements ProductDAO {
	
	private String getListProductsHQL = "SELECT pro FROM Product pro INNER JOIN pro.store sto WHERE sto.storeId = :storeId ORDER BY pro.productId ASC";
	
	/** 
	 * List all products
	 * @param Integer storeId
	 * @return List<Product>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findByStoreId(Integer storeId){
		return (List<Product>) currentSession().createQuery(getListProductsHQL).setParameter("storeId", storeId).list();
	};
	
	/** 
	 * Create new product
	 * @param Product product
	 * @return new Product if success, null if fail
	 */
	@Override
	public Product create(Product product) {
		getHibernateTemplate().save(product);
		return product;
	}
	
}
