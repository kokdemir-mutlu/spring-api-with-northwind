package com.javacamp.northwind.business.concretes;

import com.javacamp.northwind.business.abstracts.CategoryService;
import com.javacamp.northwind.core.utilities.results.DataResult;
import com.javacamp.northwind.core.utilities.results.SuccessDataResult;
import com.javacamp.northwind.dataAccess.abstracts.CategoryDao;
import com.javacamp.northwind.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;

    @Autowired
    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public DataResult<List<Category>> getAll() {
        return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(), "Data listed.");
    }

    @Override
    public DataResult<Category> getByCategoryId(int id) {
        return new SuccessDataResult<>(this.categoryDao.getByCategoryId(id),"Data listed.");
    }

    @Override
    public DataResult<Category> getByCategoryName(String name) {
        return new SuccessDataResult<>(this.categoryDao.getByCategoryName(name),"Data listed.");
    }
}
