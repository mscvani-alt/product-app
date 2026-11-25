package com.wipro.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
private String pname;
private int qty;
private double price;
private String description;


public Product() {
	super();
}
public Product(Long id, String pname, int qty, double price, String description) {
	super();
	this.id = id;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
	this.description = description;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
