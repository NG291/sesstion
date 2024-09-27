package com.productaddcart.repository;

import com.productaddcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long>{
}
