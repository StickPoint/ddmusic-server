package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicSysRolePermission;
import com.ddmusic.ddmusicserver.mapper.DdmusicSysRolePermissionDao;
import com.ddmusic.ddmusicserver.service.DdmusicSysRolePermissionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 角色权限表(DdmusicSysRolePermission)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
@Service("ddmusicSysRolePermissionService")
public class DdmusicSysRolePermissionServiceImpl implements DdmusicSysRolePermissionService {
    @Resource
    private DdmusicSysRolePermissionDao ddmusicSysRolePermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicSysRolePermission queryById(Long id) {
        return this.ddmusicSysRolePermissionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicSysRolePermission 筛选条件
     * @param pageRequest              分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicSysRolePermission> queryByPage(DdmusicSysRolePermission ddmusicSysRolePermission, PageRequest pageRequest) {
        long total = this.ddmusicSysRolePermissionDao.count(ddmusicSysRolePermission);
        return new PageImpl<>(this.ddmusicSysRolePermissionDao.queryAllByLimit(ddmusicSysRolePermission, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysRolePermission insert(DdmusicSysRolePermission ddmusicSysRolePermission) {
        this.ddmusicSysRolePermissionDao.insert(ddmusicSysRolePermission);
        return ddmusicSysRolePermission;
    }

    /**
     * 修改数据
     *
     * @param ddmusicSysRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysRolePermission update(DdmusicSysRolePermission ddmusicSysRolePermission) {
        this.ddmusicSysRolePermissionDao.update(ddmusicSysRolePermission);
        return this.queryById(ddmusicSysRolePermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicSysRolePermissionDao.deleteById(id) > 0;
    }
}
