package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicSysPermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 权限表(DdmusicSysPermission)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
public interface DdmusicSysPermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysPermission queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicSysPermission 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    Page<DdmusicSysPermission> queryByPage(DdmusicSysPermission ddmusicSysPermission, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicSysPermission 实例对象
     * @return 实例对象
     */
    DdmusicSysPermission insert(DdmusicSysPermission ddmusicSysPermission);

    /**
     * 修改数据
     *
     * @param ddmusicSysPermission 实例对象
     * @return 实例对象
     */
    DdmusicSysPermission update(DdmusicSysPermission ddmusicSysPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
