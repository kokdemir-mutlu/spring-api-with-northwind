package com.javacamp.northwind.business.abstracts;

import com.javacamp.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

}
