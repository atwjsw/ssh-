package com.atwjsw.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.atwjsw.ssh.dao.ProductDao;
import com.atwjsw.ssh.domain.Product;

@Transactional
public class ProductService {
	
	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void saveProduct(Product product) {
		System.out.println("ProductService.saveProduct");
		productDao.saveProduct(product);	
		
	}

}
