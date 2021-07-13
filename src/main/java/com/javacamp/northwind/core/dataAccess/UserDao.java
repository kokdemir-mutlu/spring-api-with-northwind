package com.javacamp.northwind.core.dataAccess;

import com.javacamp.northwind.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmail(String email);

}
