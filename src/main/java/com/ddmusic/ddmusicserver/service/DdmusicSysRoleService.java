package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicSysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 角色表(DdmusicSysRole)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
public interface DdmusicSysRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysRole queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicSysRole 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    Page<DdmusicSysRole> queryByPage(DdmusicSysRole ddmusicSysRole, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicSysRole 实例对象
     * @return 实例对象
     */
    DdmusicSysRole insert(DdmusicSysRole ddmusicSysRole);

    /**
     * 修改数据
     *
     * @param ddmusicSysRole 实例对象
     * @return 实例对象
     */
    DdmusicSysRole update(DdmusicSysRole ddmusicSysRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
