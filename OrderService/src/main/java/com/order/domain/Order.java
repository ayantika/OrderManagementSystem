package com.order.domain;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;


@Table(name = "ORDER")
@Entity
public class Order {
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShippngAddress() {
		return shippngAddress;
	}

	public void setShippngAddress(String shippngAddress) {
		this.shippngAddress = shippngAddress;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Id
	@GeneratedValue
	Integer orderId;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	String customerName;
	
	String shippngAddress;
	
	Date orderDate;

	List<Item> orderItems;
	
	@OneToMany(targetEntity=Item.class, mappedBy="order",fetch=FetchType.EAGER)
	public List<Item> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Item> orderItems) {
		this.orderItems = orderItems;
	}

	double price;
	
}
