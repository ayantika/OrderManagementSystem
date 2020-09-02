package com.order.item.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.item.domain.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository <OrderItem, Integer>{

}
