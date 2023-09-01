package com.excercise.day6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="order")
public class OrderEntity {
	@Id
	@GeneratedValue
	private Long id;
	private Long orderNumber;
	public OrderEntity() {
		super();

	}
	public OrderEntity(Long id, Long orderNumber) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	

}
