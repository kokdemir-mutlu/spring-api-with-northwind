package com.javacamp.northwind.api.controllers;


import com.javacamp.northwind.business.abstracts.CategoryService;
import com.javacamp.northwind.core.utilities.results.DataResult;
import com.javacamp.northwind.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategoriesController {

    private CategoryService categoryService;

    @Autowired
    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getall")
    @ResponseBody
    public DataResult<List<Category>> getAll(){
        return this.categoryService.getAll();
    }

    @GetMapping("/getByName")
    @ResponseBody
    public DataResult<Category> getByCategoryName(@RequestParam String name){
        return this.categoryService.getByCategoryName(name);
    }

    @GetMapping("/getById")
    @ResponseBody
    public DataResult<Category> getById(@RequestParam int id){
        return this.categoryService.getByCategoryId(id);
    }

}
