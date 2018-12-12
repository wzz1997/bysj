package com.wzz.zuolibackend.pojo;

import java.io.Serializable;

/**
 * warehouse
 * @author 
 */
public class Warehouse implements Serializable {
    /**
     * 仓库id
     */
    private Integer id;

    /**
     * 仓库的名称
     */
    private String warehouse;

    /**
     * 仓库存量
     */
    private Integer warehouse_count;

    /**
     * 管理人员
     */
    private Integer admin_id;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getWarehouse_count() {
        return warehouse_count;
    }

    public void setWarehouse_count(Integer warehouse_count) {
        this.warehouse_count = warehouse_count;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }
}