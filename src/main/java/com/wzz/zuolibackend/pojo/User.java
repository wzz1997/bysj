package com.wzz.zuolibackend.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.pojo
 * @ClassName: User
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/11 0011 11:49
 * @Version: 1.0.2
 */
@Data
@Table(name="user")
@ApiModel("人员信息类")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @ApiModelProperty("人员id")
   private  Integer id;
   @ApiModelProperty("人员姓名")
   private  String username;
   @ApiModelProperty("人员密码")
   private  String password;
   @ApiModelProperty("人员角色")
   @Column(name="user_type")
   private  Integer userType;
   @Column(name="user_statu")
   @ApiModelProperty("人员状态")
   private Integer userStatu;

}
