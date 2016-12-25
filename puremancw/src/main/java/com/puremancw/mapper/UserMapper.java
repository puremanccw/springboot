package com.puremancw.mapper;

import com.puremancw.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by puremancw on 2016/12/25.
 */
@Mapper
public interface UserMapper {

    @Insert({"insert into user (id,name, age, password) values (#{age,jdbcType=INTEGER},#{name,jdbcType=VARCHAR},#{age,jdbcType=INTEGER}, #{password,jdbcType=VARCHAR})"})
    int insert(User user);

    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name")String name);
}
