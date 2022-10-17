package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicSysPermission;
import com.ddmusic.ddmusicserver.mapper.DdmusicSysPermissionDao;
import com.ddmusic.ddmusicserver.service.DdmusicSysPermissionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 权限表(DdmusicSysPermission)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
@Service("ddmusicSysPermissionService")
public class DdmusicSysPermissionServiceImpl implements DdmusicSysPermissionService {
    @Resource
    private DdmusicSysPermissionDao ddmusicSysPermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicSysPermission queryById(Long id) {
        return this.ddmusicSysPermissionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicSysPermission 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicSysPermission> queryByPage(DdmusicSysPermission ddmusicSysPermission, PageRequest pageRequest) {
        long total = this.ddmusicSysPermissionDao.count(ddmusicSysPermission);
        return new PageImpl<>(this.ddmusicSysPermissionDao.queryAllByLimit(ddmusicSysPermission, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysPermission 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysPermission insert(DdmusicSysPermission ddmusicSysPermission) {
        this.ddmusicSysPermissionDao.insert(ddmusicSysPermission);
        return ddmusicSysPermission;
    }

    /**
     * 修改数据
     *
     * @param ddmusicSysPermission 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysPermission update(DdmusicSysPermission ddmusicSysPermission) {
        this.ddmusicSysPermissionDao.update(ddmusicSysPermission);
        return this.queryById(ddmusicSysPermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicSysPermissionDao.deleteById(id) > 0;
    }
}
