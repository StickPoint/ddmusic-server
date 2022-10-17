package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicSysRole;
import com.ddmusic.ddmusicserver.mapper.DdmusicSysRoleDao;
import com.ddmusic.ddmusicserver.service.DdmusicSysRoleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 角色表(DdmusicSysRole)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
@Service("ddmusicSysRoleService")
public class DdmusicSysRoleServiceImpl implements DdmusicSysRoleService {
    @Resource
    private DdmusicSysRoleDao ddmusicSysRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicSysRole queryById(Long id) {
        return this.ddmusicSysRoleDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicSysRole 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicSysRole> queryByPage(DdmusicSysRole ddmusicSysRole, PageRequest pageRequest) {
        long total = this.ddmusicSysRoleDao.count(ddmusicSysRole);
        return new PageImpl<>(this.ddmusicSysRoleDao.queryAllByLimit(ddmusicSysRole, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysRole 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysRole insert(DdmusicSysRole ddmusicSysRole) {
        this.ddmusicSysRoleDao.insert(ddmusicSysRole);
        return ddmusicSysRole;
    }

    /**
     * 修改数据
     *
     * @param ddmusicSysRole 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysRole update(DdmusicSysRole ddmusicSysRole) {
        this.ddmusicSysRoleDao.update(ddmusicSysRole);
        return this.queryById(ddmusicSysRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicSysRoleDao.deleteById(id) > 0;
    }
}
