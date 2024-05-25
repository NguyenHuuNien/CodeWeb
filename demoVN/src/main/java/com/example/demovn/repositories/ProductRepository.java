package com.example.demovn.repositories;

import com.example.demovn.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}
