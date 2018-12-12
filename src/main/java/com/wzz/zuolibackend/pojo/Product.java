package com.wzz.zuolibackend.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * product
 * @author 
 */
public class Product implements Serializable {
    /**
     * 商品id
     */
    private Integer id;

    /**
     * 入库商品的名称
     */
    private String product;

    /**
     * 产品编号
     */
    private String product_number;

    /**
     * 产品数量
     */
    private Integer count;

    /**
     * 仓库id
     */
    private Integer warehouse_id;

    /**
     * 更新时间
     */
    private Date u_time;

    /**
     * 创建时间
     */
    private Date c_time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public Date getU_time() {
        return u_time;
    }

    public void setU_time(Date u_time) {
        this.u_time = u_time;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }
}