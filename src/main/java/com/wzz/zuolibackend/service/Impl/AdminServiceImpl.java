package com.wzz.zuolibackend.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzz.zuolibackend.common.model.PageInfoDTO;
import com.wzz.zuolibackend.dao.AdminMapper;
import com.wzz.zuolibackend.pojo.Admin;
import com.wzz.zuolibackend.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: zuolibackend
 * @Package: com.wzz.zuolibackend.service.Impl
 * @ClassName: UserServiceImpl
 * @Author: wzz
 * @Description: ${description}
 * @Date: 2018/12/11 0011 11:58
 * @Version: 1.0.2
 */
@Service
public class AdminServiceImpl implements AdminService {
@Resource
private AdminMapper adminMapper;

    /**
     * 新增管理人员
     *
     * @param admin
     * @return
     */
    @Override
    public Integer insertAdmin(Admin admin) {
        return adminMapper.insertSelective(admin);
    }

    /**
     * 修改管理人员
     *
     * @param admin
     */
    @Override
    public Integer updateAdmin(Admin admin) {
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    /**
     * 删除管理人员
     *
     * @param id
     * @return
     */
    @Override
    public Integer deleteAdmin(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    /**
     * 通过id获取管理人员
     *
     * @param id
     * @return
     */
    @Override
    public Admin getAdminById(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取所有管理人员分页
     *
     * @return
     */
    @Override
    public PageInfo<Admin> getAllAdmin(PageInfoDTO pageInfoDTO) {
        PageHelper.startPage(pageInfoDTO.getPageNum(),pageInfoDTO.getPageSize());
        return new PageInfo<>(adminMapper.getAllAdmin());
    }

    @Override
    public Admin getAdminByAccount(String account) {
        return adminMapper.getAdminByAccount(account);
    }
}
