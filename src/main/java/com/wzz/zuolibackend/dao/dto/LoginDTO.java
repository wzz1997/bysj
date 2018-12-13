package com.wzz.zuolibackend.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.dao.dto
 * @ClassName: LoginDTO
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/13 0013 14:13
 * @Version: 1.0.2
 */
@Data
@ApiModel("LoginDTO 登录DTO")
public class LoginDTO {

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("密码")
    private String password;


}
