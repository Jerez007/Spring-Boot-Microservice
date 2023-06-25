package com.jsprogramming.orderservice.repository;

import com.jsprogramming.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
