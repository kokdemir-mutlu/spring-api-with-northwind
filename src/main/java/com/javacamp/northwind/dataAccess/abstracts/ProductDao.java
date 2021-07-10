package com.javacamp.northwind.dataAccess.abstracts;

import com.javacamp.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
