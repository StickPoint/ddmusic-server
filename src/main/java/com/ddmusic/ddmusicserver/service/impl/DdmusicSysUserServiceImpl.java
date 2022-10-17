package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicSysUser;
import com.ddmusic.ddmusicserver.mapper.DdmusicSysUserDao;
import com.ddmusic.ddmusicserver.service.DdmusicSysUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 后台用户表(DdmusicSysUser)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
@Service("ddmusicSysUserService")
public class DdmusicSysUserServiceImpl implements DdmusicSysUserService {
    @Resource
    private DdmusicSysUserDao ddmusicSysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicSysUser queryById(Long id) {
        return this.ddmusicSysUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicSysUser 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicSysUser> queryByPage(DdmusicSysUser ddmusicSysUser, PageRequest pageRequest) {
        long total = this.ddmusicSysUserDao.count(ddmusicSysUser);
        return new PageImpl<>(this.ddmusicSysUserDao.queryAllByLimit(ddmusicSysUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysUser insert(DdmusicSysUser ddmusicSysUser) {
        this.ddmusicSysUserDao.insert(ddmusicSysUser);
        return ddmusicSysUser;
    }

    /**
     * 修改数据
     *
     * @param ddmusicSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysUser update(DdmusicSysUser ddmusicSysUser) {
        this.ddmusicSysUserDao.update(ddmusicSysUser);
        return this.queryById(ddmusicSysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicSysUserDao.deleteById(id) > 0;
    }
}
