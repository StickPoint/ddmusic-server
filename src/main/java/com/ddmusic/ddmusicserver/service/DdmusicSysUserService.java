package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicSysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 后台用户表(DdmusicSysUser)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
public interface DdmusicSysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysUser queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicSysUser 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    Page<DdmusicSysUser> queryByPage(DdmusicSysUser ddmusicSysUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicSysUser 实例对象
     * @return 实例对象
     */
    DdmusicSysUser insert(DdmusicSysUser ddmusicSysUser);

    /**
     * 修改数据
     *
     * @param ddmusicSysUser 实例对象
     * @return 实例对象
     */
    DdmusicSysUser update(DdmusicSysUser ddmusicSysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
