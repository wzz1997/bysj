package com.wzz.zuolibackend.dao;

import com.wzz.zuolibackend.pojo.ProductIn;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInDao {


;

    int deleteByPrimaryKey(Integer id);

    int insert(ProductIn record);

    int insertSelective(ProductIn record);

    ProductIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductIn record);

    int updateByPrimaryKey(ProductIn record);
}