package com.ddmusic.ddmusicserver.mapper;

import com.ddmusic.ddmusicserver.common.entity.DdmusicSysRolePermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 角色权限表(DdmusicSysRolePermission)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-17 17:58:05
 */
public interface DdmusicSysRolePermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysRolePermission queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param ddmusicSysRolePermission 查询条件
     * @param pageable                 分页对象
     * @return 对象列表
     */
    List<DdmusicSysRolePermission> queryAllByLimit(DdmusicSysRolePermission ddmusicSysRolePermission, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param ddmusicSysRolePermission 查询条件
     * @return 总行数
     */
    long count(DdmusicSysRolePermission ddmusicSysRolePermission);

    /**
     * 新增数据
     *
     * @param ddmusicSysRolePermission 实例对象
     * @return 影响行数
     */
    int insert(DdmusicSysRolePermission ddmusicSysRolePermission);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicSysRolePermission> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DdmusicSysRolePermission> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicSysRolePermission> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DdmusicSysRolePermission> entities);

    /**
     * 修改数据
     *
     * @param ddmusicSysRolePermission 实例对象
     * @return 影响行数
     */
    int update(DdmusicSysRolePermission ddmusicSysRolePermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

