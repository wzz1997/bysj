package com.wzz.zuolibackend.service;

import com.github.pagehelper.PageInfo;
import com.wzz.zuolibackend.common.model.PageInfoDTO;
import com.wzz.zuolibackend.pojo.ProductOut;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.service
 * @ClassName: ProductOutService
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/17 0017 10:26
 * @Version: 1.0.2
 */
public interface ProductOutService {
    Integer insertProductOut(ProductOut productOut);

    Integer deleteProductOut(Integer integer);

    Integer updateProductOut(ProductOut productOut);

    PageInfo<ProductOut> getProductOutPage(PageInfoDTO pageInfoDTO);
}
