package com.puremancw.mapper;

import com.puremancw.domain.User;
import com.puremancw.utils.BaseMapper;
import org.apache.ibatis.annotations.*;

/**
 * Created by puremancw on 2016/12/25.
 */
public interface UserMapper extends BaseMapper<User> {

    int insert(User user);

    User findUserByName(@Param("name")String name);
}
