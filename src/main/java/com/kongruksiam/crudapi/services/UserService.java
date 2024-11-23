package com.kongruksiam.crudapi.services;

import com.kongruksiam.crudapi.entity.User;
import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(Integer id);
    void deleteById(Integer id);
}
