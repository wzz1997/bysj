package com.wzz.zuolibackend.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * admin
 * @author 
 */

@ApiModel("Admin 管理人员表")
public class Admin implements Serializable {
    /**
     * 后台管理人员id
     */
    @ApiModelProperty("gid")
    private Integer id;

    /**
     * 后台账号
     */
    @ApiModelProperty("后台账号")
    private String account;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 真实姓名
     */
    @ApiModelProperty("真实姓名")
    private String realname;

    /**
     * 状态 0 被删除 1正常
     */
    @ApiModelProperty("状态 0 被删除 1正常")
    private Integer status;

    /**
     * 是否为root账号 1为root 0为普通
     */
    @ApiModelProperty("是否为root账号 1为root 0为普通")
    private Integer acl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAcl() {
        return acl;
    }

    public void setAcl(Integer acl) {
        this.acl = acl;
    }
}