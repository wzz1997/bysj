package com.wzz.zuolibackend.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * product_relation
 * @author 
 */
public class ProductRelation implements Serializable {
    /**
     * 仓库——商品 信息id
     */
    private Integer id;

    /**
     * 仓库id
     */
    private Integer warehouse_id;

    /**
     * 商品id
     */
    private Integer product_id;

    /**
     * 商品数量
     */
    private Integer count;

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

    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductRelation other = (ProductRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWarehouse_id() == null ? other.getWarehouse_id() == null : this.getWarehouse_id().equals(other.getWarehouse_id()))
            && (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getU_time() == null ? other.getU_time() == null : this.getU_time().equals(other.getU_time()))
            && (this.getC_time() == null ? other.getC_time() == null : this.getC_time().equals(other.getC_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWarehouse_id() == null) ? 0 : getWarehouse_id().hashCode());
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getU_time() == null) ? 0 : getU_time().hashCode());
        result = prime * result + ((getC_time() == null) ? 0 : getC_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", warehouse_id=").append(warehouse_id);
        sb.append(", product_id=").append(product_id);
        sb.append(", count=").append(count);
        sb.append(", u_time=").append(u_time);
        sb.append(", c_time=").append(c_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}