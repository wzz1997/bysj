package com.wzz.zuolibackend.dao;

import com.wzz.zuolibackend.pojo.Admin;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface AdminMapper  {


    int deleteByPrimaryKey(Integer id);

    List<Admin> getAllAdmin();

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}