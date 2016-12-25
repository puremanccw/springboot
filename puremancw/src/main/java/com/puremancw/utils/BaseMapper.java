package com.puremancw.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by puremancw on 2016/12/26.
 */

public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
