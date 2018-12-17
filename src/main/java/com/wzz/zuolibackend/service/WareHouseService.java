package com.wzz.zuolibackend.service;

import com.github.pagehelper.PageInfo;
import com.wzz.zuolibackend.pojo.Warehouse;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.service
 * @ClassName: WareHouseService
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/17 0017 10:25
 * @Version: 1.0.2
 */
public interface WareHouseService {

    Integer insertWareHouse();


    Integer deleteWareHouse();


    PageInfo<Warehouse> getEareHousePage();



}
