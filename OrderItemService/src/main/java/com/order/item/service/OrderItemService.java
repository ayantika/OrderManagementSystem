package com.order.item.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.order.item.domain.OrderItem;


@Service
@Component
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;

	public List<OrderItem> getAllOrderItems() {
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItemRepository.findAll().forEach(item -> orderItems.add(item));
		return orderItems;
	}

	public Optional<OrderItem> getOrderItemById(int id) {
		return orderItemRepository.findById(id);
	}

	public void saveOrUpdate(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}

	public void delete(int id) {
		orderItemRepository.deleteById(id);
	}

}
