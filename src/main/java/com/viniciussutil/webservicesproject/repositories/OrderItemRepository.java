package com.viniciussutil.webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussutil.webservicesproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {	
	
}