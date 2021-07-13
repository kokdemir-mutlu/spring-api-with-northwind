package com.javacamp.northwind.business.concretes;

import com.javacamp.northwind.business.abstracts.UserService;
import com.javacamp.northwind.core.dataAccess.UserDao;
import com.javacamp.northwind.core.entities.User;
import com.javacamp.northwind.core.utilities.results.DataResult;
import com.javacamp.northwind.core.utilities.results.Result;
import com.javacamp.northwind.core.utilities.results.SuccesResult;
import com.javacamp.northwind.core.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccesResult("User added.");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<>(this.userDao.findByEmail(email),"User found.");
    }
}
