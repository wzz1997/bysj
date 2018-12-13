package com.wzz.zuolibackend.service;

import com.github.pagehelper.PageInfo;
import com.wzz.zuolibackend.pojo.Admin;

import java.util.List;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.service
 * @ClassName: AdminService
 * @Author: wzz
 * @Description: 管理人员接口
 * @Date: 2018/12/11 22:32
 * @Version: 1.0
 */
public interface AdminService {


    /**
     * 新增管理人员
     * @param admin
     * @return
     */
   Integer insertAdmin(Admin admin);


    /**
     * 修改管理人员
     */
  Integer updateAdmin(Admin admin);


    /**
     * 删除管理人员
      * @param id
     * @return
     */
  Integer deleteAdmin(Integer id);

    /**
     *  通过id获取管理人员
     * @param id
     * @return
     */

  Admin getAdminById(Integer id);

    /**
     * 获取所有管理人员分页
     * @return
     */

  PageInfo<Admin> getAllAdmin();


  Admin getAdminByAccount(String account);





}
