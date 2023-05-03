package com.viniciussutil.webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussutil.webservicesproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {	
	
}