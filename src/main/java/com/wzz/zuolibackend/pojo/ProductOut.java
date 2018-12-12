package com.wzz.zuolibackend.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * product_out
 * @author 
 */
public class ProductOut implements Serializable {
    private Integer id;

    /**
     * 出库时间
     */
    private Date warehouseOutTime;

    /**
     * 产品id
     */
    private Integer productId;

    private Integer productCount;

    private Integer warehouseId;

    private Integer operationId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getWarehouseOutTime() {
        return warehouseOutTime;
    }

    public void setWarehouseOutTime(Date warehouseOutTime) {
        this.warehouseOutTime = warehouseOutTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
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
        ProductOut other = (ProductOut) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWarehouseOutTime() == null ? other.getWarehouseOutTime() == null : this.getWarehouseOutTime().equals(other.getWarehouseOutTime()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductCount() == null ? other.getProductCount() == null : this.getProductCount().equals(other.getProductCount()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getOperationId() == null ? other.getOperationId() == null : this.getOperationId().equals(other.getOperationId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWarehouseOutTime() == null) ? 0 : getWarehouseOutTime().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductCount() == null) ? 0 : getProductCount().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", warehouseOutTime=").append(warehouseOutTime);
        sb.append(", productId=").append(productId);
        sb.append(", productCount=").append(productCount);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", operationId=").append(operationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}