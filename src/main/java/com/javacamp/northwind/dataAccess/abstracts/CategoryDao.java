package com.javacamp.northwind.dataAccess.abstracts;

import com.javacamp.northwind.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    Category getByCategoryId(int id);

    Category getByCategoryName(String name);
}
