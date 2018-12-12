package com.wzz.zuolibackend.dao;

import com.wzz.zuolibackend.pojo.ProductOut;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductOutDao {


    int deleteByPrimaryKey(Integer id);

    int insert(ProductOut record);

    int insertSelective(ProductOut record);

    ProductOut selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductOut record);

    int updateByPrimaryKey(ProductOut record);
}