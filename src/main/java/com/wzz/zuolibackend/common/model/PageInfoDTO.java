package com.wzz.zuolibackend.common.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.common.model
 * @ClassName: PageInfoDTO
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/12 20:06
 * @Version: 1.0
 */
public class PageInfoDTO {

    @ApiModelProperty("当前页")
    private Integer pageNum;

    @ApiModelProperty("每一页显示条数")
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if (pageNum == null) {
            this.pageNum = 1;
        } else {
            this.pageNum = pageNum;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize == null) {
            this.pageSize = 20;
        } else {
            this.pageSize = pageSize;
        }
    }

    @Override
    public String toString() {
        return "PageInfoDTO{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}

