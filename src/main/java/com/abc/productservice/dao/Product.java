package com.abc.productservice.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product_service")
public class Product {
	
	@Id
	@Column(name="productid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productid;
	
	@Column(name="productname")
	private String productname;
	
	@Column(name="productcatagory")
	private String productcatagory;
	
	@Column(name="productprice")
	private double productprice;
	
	@Column(name="productstatus")
	private String productstatus;

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductcatagory() {
		return productcatagory;
	}

	public void setProductcatagory(String productcatagory) {
		this.productcatagory = productcatagory;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public String getProductstatus() {
		return productstatus;
	}

	public void setProductstatus(String productstatus) {
		this.productstatus = productstatus;
	}
	
}
