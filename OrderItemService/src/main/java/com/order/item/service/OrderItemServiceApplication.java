package com.order.item.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.order.item.*"})
@EntityScan({"com.order.item.dto"})
public class OrderItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderItemServiceApplication.class, args);
	}

}
