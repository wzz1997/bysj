package com.wzz.zuolibackend.controller;

import com.github.pagehelper.PageInfo;
import com.wzz.zuolibackend.common.model.ErrorConstant;
import com.wzz.zuolibackend.common.model.PageInfoDTO;
import com.wzz.zuolibackend.common.model.Result;
import com.wzz.zuolibackend.dao.dto.LoginDTO;
import com.wzz.zuolibackend.pojo.Admin;
import com.wzz.zuolibackend.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.controller
 * @ClassName: SysUserLoginController
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/11 0011 11:40
 * @Version: 1.0.2
 */
@RestController
@RequestMapping("/sys")
@Api(value = "SysUserLoginController" ,tags = "卓立物流信息服务")
public class SysUserLoginController {
    @Autowired
    private AdminService adminService;


    @PostMapping("/admin")
    @ApiOperation(value = "新增管理人员", notes = "所需字段：user")
    public Result addAdmin(@RequestBody Admin admin) {
        BCryptPasswordEncoder bCryptPasswordEncoder= new BCryptPasswordEncoder();
        admin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        Integer integer = adminService.insertAdmin(admin);
        if (integer > 0) {
            return Result.ok("新增成功");
        }
        return Result.error("新增失败");
    }

    @PostMapping("/login")
    @ApiOperation(value = "登录接口", notes = "账号，密码")
    public Result login(@RequestBody LoginDTO loginDTO){
        Admin adminByAccount = adminService.getAdminByAccount(loginDTO.getAccount());
        if (adminByAccount==null){
            Result.error("用户不存在");
        }
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        if(!bCryptPasswordEncoder.matches(loginDTO.getPassword(),adminByAccount.getPassword())) {
            return Result.error(ErrorConstant.ERROR_WRONG_PASSWORD, ErrorConstant.ERROR_WRONG_PASSWORD_MSG);
        }
        adminByAccount.setPassword(null);
        return Result.ok(adminByAccount);
    }

    @DeleteMapping("/admin")
    @ApiOperation(value = "删除人员",notes = "id")
    public Result deleteAdmin(@RequestParam("id")Integer id){
        Integer integer = adminService.deleteAdmin(id);
        if (integer>0){
            return Result.ok("删除成功");
        }
         return Result.error("删除失败");
    }

    @PutMapping("/admin")
    @ApiOperation(value = "更新人员", notes = "admin")
    public Result updateAdmin(@RequestBody Admin admin){
        Integer integer = adminService.updateAdmin(admin);
        if (integer>0){
            return Result.ok("更新成功");
        }
    return Result.error("更新失败");
    }

   @PostMapping("/adminPage")
    @ApiOperation(value = "获取管理人员分页",notes = "")
    public Result<PageInfo<Admin>> getAdminList(@RequestBody PageInfoDTO pageInfoDTO){
      return Result.ok(adminService.getAllAdmin(pageInfoDTO));
   }







}
