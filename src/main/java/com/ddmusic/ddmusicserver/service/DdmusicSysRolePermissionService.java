package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicSysRolePermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 角色权限表(DdmusicSysRolePermission)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
public interface DdmusicSysRolePermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysRolePermission queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicSysRolePermission 筛选条件
     * @param pageRequest              分页对象
     * @return 查询结果
     */
    Page<DdmusicSysRolePermission> queryByPage(DdmusicSysRolePermission ddmusicSysRolePermission, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicSysRolePermission 实例对象
     * @return 实例对象
     */
    DdmusicSysRolePermission insert(DdmusicSysRolePermission ddmusicSysRolePermission);

    /**
     * 修改数据
     *
     * @param ddmusicSysRolePermission 实例对象
     * @return 实例对象
     */
    DdmusicSysRolePermission update(DdmusicSysRolePermission ddmusicSysRolePermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
