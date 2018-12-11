package com.wzz.zuolibackend.service.Impl;

import com.wzz.zuolibackend.dao.UserMapper;
import com.wzz.zuolibackend.pojo.User;
import com.wzz.zuolibackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.service.Impl
 * @ClassName: UserServiceImpl
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/11 0011 11:58
 * @Version: 1.0.2
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Integer addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
