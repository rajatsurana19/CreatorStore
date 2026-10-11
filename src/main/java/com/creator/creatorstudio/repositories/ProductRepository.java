package com.creator.creatorstudio.repositories;

import com.creator.creatorstudio.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
