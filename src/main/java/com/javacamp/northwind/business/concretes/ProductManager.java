package com.javacamp.northwind.business.concretes;

import com.javacamp.northwind.business.abstracts.ProductService;
import com.javacamp.northwind.core.utilities.results.DataResult;
import com.javacamp.northwind.core.utilities.results.Result;
import com.javacamp.northwind.core.utilities.results.SuccesResult;
import com.javacamp.northwind.core.utilities.results.SuccessDataResult;
import com.javacamp.northwind.dataAccess.abstracts.ProductDao;
import com.javacamp.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>
                (this.productDao.findAll(),"Data listed.");
    }

    @Override
    public Result add(Product product) {
        productDao.save(product);
        return new SuccesResult("Product added.");
    }
}
