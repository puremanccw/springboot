package com.puremancw.conf.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by puremancw on 2016/12/25.
 */

@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
        })
    /**
     * Druid拦截器，用于查看Druid监控
     */
    public class DruidStatFilter extends WebStatFilter {

    }
