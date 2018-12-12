package com.wzz.zuolibackend.dao;

import com.wzz.zuolibackend.pojo.ProductRelation;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRelationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductRelation record);

    int insertSelective(ProductRelation record);

    ProductRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductRelation record);

    int updateByPrimaryKey(ProductRelation record);
}