package com.puremancw.web;

import com.puremancw.domain.User;
import com.puremancw.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by puremancw on 2016/12/25.
 */
@Api(value = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value="/postuser", method= RequestMethod.POST)
    public String postUser(@RequestBody User user) {
        userService.add(user);
        return "success";
    }

    @ApiOperation(value="查询用户", notes="根据name查询用户")
    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    @ResponseBody
    public String user(String name){
        User user = userService.getUserByName(name);
        return user.getName()+"-----"+user.getAge();
    }

}
