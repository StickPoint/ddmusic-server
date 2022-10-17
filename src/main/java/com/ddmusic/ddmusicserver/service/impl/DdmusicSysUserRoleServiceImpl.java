package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicSysUserRole;
import com.ddmusic.ddmusicserver.mapper.DdmusicSysUserRoleDao;
import com.ddmusic.ddmusicserver.service.DdmusicSysUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (DdmusicSysUserRole)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
@Service("ddmusicSysUserRoleService")
public class DdmusicSysUserRoleServiceImpl implements DdmusicSysUserRoleService {
    @Resource
    private DdmusicSysUserRoleDao ddmusicSysUserRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicSysUserRole queryById(Long id) {
        return this.ddmusicSysUserRoleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicSysUserRole 筛选条件
     * @param pageRequest        分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicSysUserRole> queryByPage(DdmusicSysUserRole ddmusicSysUserRole, PageRequest pageRequest) {
        long total = this.ddmusicSysUserRoleDao.count(ddmusicSysUserRole);
        return new PageImpl<>(this.ddmusicSysUserRoleDao.queryAllByLimit(ddmusicSysUserRole, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysUserRole insert(DdmusicSysUserRole ddmusicSysUserRole) {
        this.ddmusicSysUserRoleDao.insert(ddmusicSysUserRole);
        return ddmusicSysUserRole;
    }

    /**
     * 修改数据
     *
     * @param ddmusicSysUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysUserRole update(DdmusicSysUserRole ddmusicSysUserRole) {
        this.ddmusicSysUserRoleDao.update(ddmusicSysUserRole);
        return this.queryById(ddmusicSysUserRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicSysUserRoleDao.deleteById(id) > 0;
    }
}
