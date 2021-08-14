package com.javacamp.northwind.business.abstracts;

import com.javacamp.northwind.core.utilities.results.DataResult;
import com.javacamp.northwind.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    DataResult<List<Category>> getAll();

    DataResult<Category> getByCategoryId(int id);

    DataResult<Category> getByCategoryName(String name);
}
