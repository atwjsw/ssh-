package com.atwjsw.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atwjsw.ssh.domain.Product;

public class ProductDao extends HibernateDaoSupport {
	
	public void saveProduct(Product product) {
		System.out.println("ProductDao save product to database " + product );
		this.getHibernateTemplate().save(product);
		
	}

}
