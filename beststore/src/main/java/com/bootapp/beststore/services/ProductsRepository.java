package com.bootapp.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootapp.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{
	
}
