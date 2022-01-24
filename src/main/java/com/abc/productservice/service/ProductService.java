package com.abc.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.productservice.dao.Product;
import com.abc.productservice.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productrepo;

	public Product addProduct(Product productReq) {
		return productrepo.save(productReq);
	}

	public List<Product> getAllProducts() {
		return productrepo.findAll();
	}

	public Product updateProductById(Product product, long id) {
		Product productresp = productrepo.findById(id).get();
		if (productresp != null) {
			productresp.setProductname(product.getProductname());
			productresp.setProductcatagory(product.getProductcatagory());
			productresp.setProductprice(product.getProductprice());
			productresp.setProductstatus(product.getProductstatus());
			productrepo.save(productresp);
		}
		return productresp;

	}

	public void deleteProductById(long id) {
		productrepo.deleteById(id);

	}

	public Optional<Product> getProductById(long id) {
		return productrepo.findById(id);
	}

}
