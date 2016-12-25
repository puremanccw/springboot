package com.puremancw.service;


import com.puremancw.domain.User;

/**
 * Created by puremancw on 2016/12/25.
 */

public interface  UserService {

    boolean add(User user);

    User getUserByName(String name);
}
