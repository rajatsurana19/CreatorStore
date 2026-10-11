package com.creator.creatorstudio.repositories;

import com.creator.creatorstudio.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
