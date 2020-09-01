package com.order.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.item.dto.OrderItem;
import com.order.item.service.OrderItemService;

@RestController
public class OrderItemController {
	   @Autowired
	   OrderItemService orderItemService;

	    @GetMapping("/orderitem")
	    private List<OrderItem> getAllOrderitem() {
	        return orderItemService.getAllOrderItems();
	    }

	    @GetMapping("/orderitem/{id}")
	    private OrderItem getOrderItem(@PathVariable("id") int id) {
	        return orderItemService.getOrderItemById(id);
	    }

	    @DeleteMapping("/orderitem/{id}")
	    private void deleteOrderItem(@PathVariable("id") int id) {
	    	orderItemService.delete(id);;
	    }

	    @PostMapping("/orderitem")
	    private int savePerson(@RequestBody OrderItem orderItem) {
	    	orderItemService.saveOrUpdate(orderItem);
	        return orderItem.getCode();
	    }
	
}
