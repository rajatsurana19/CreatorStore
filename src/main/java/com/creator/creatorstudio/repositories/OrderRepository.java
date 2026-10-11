package com.creator.creatorstudio.repositories;

import com.creator.creatorstudio.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}