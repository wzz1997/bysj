package com.wzz.zuolibackend.dao;

import com.wzz.zuolibackend.pojo.Warehouse;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}