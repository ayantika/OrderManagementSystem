package com.order.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ITEM")
public class Item {

	String name;
	
	@Id
	Integer code;

	int quantity;
	
}
