package com.atwjsw.ssh.action;

import com.atwjsw.ssh.domain.Product;
import com.atwjsw.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	
	private Product product = new Product();
	
	@Override
	public Product getModel() {
		return product;
	}
	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	public String save() {
		
		System.out.println("Action中的Save" + product);
		productService.saveProduct(product);
		return NONE;
	}



}
