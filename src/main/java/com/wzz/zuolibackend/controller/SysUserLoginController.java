package com.wzz.zuolibackend.controller;

import com.wzz.zuolibackend.common.model.Result;
import com.wzz.zuolibackend.pojo.User;
import com.wzz.zuolibackend.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.controller
 * @ClassName: SysUserLoginController
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/11 0011 11:40
 * @Version: 1.0.2
 */
@RestController
@RequestMapping("/sys")
@Api(value = "SysUserLoginController" ,tags = "卓立物流信息服务")
public class SysUserLoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation(value = "新增管理人员", notes = "所需字段：user")
    public Result sysLogin(@RequestBody User user) {
        BCryptPasswordEncoder bCryptPasswordEncoder= new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Integer integer = userService.addUser(user);
        if (integer > 0) {
            return Result.ok("新增成功");
        }
        return Result.error("新增失败");
    }

    @GetMapping("/hello")
    public Result hello(){
        return Result.ok("hello world");
    }




}
