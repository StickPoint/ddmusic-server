package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicSysUserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (DdmusicSysUserRole)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
public interface DdmusicSysUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysUserRole queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicSysUserRole 筛选条件
     * @param pageRequest        分页对象
     * @return 查询结果
     */
    Page<DdmusicSysUserRole> queryByPage(DdmusicSysUserRole ddmusicSysUserRole, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicSysUserRole 实例对象
     * @return 实例对象
     */
    DdmusicSysUserRole insert(DdmusicSysUserRole ddmusicSysUserRole);

    /**
     * 修改数据
     *
     * @param ddmusicSysUserRole 实例对象
     * @return 实例对象
     */
    DdmusicSysUserRole update(DdmusicSysUserRole ddmusicSysUserRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
