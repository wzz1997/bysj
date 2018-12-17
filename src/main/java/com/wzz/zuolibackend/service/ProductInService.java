package com.wzz.zuolibackend.service;

import com.wzz.zuolibackend.pojo.ProductIn;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.service
 * @ClassName: ProductInService
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/17 0017 10:26
 * @Version: 1.0.2
 */
public interface ProductInService {
    Integer insertProductIn(ProductIn productIn);

    Integer deleteProductIn(Integer id);


   Integer updateProductIn(ProductIn productIn);



}
