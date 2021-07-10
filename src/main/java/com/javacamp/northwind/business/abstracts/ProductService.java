package com.javacamp.northwind.business.abstracts;

import com.javacamp.northwind.core.utilities.results.DataResult;
import com.javacamp.northwind.core.utilities.results.Result;
import com.javacamp.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
