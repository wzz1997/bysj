package com.wzz.zuolibackend.service;

import com.github.pagehelper.PageInfo;
import com.wzz.zuolibackend.pojo.Product;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.service
 * @ClassName: ProductService
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/17 0017 10:25
 * @Version: 1.0.2
 */
public interface ProductService {

    Integer insertProduct(Product product);


    Integer updateProduct(Product product);


    Integer deleteProduct(Integer id);


    PageInfo<Product> getProductPage();





}
