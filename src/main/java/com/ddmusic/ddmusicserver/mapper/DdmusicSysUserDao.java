package com.ddmusic.ddmusicserver.mapper;


import com.ddmusic.ddmusicserver.common.entity.DdmusicSysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 后台用户表(DdmusicSysUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-17 17:58:05
 */
public interface DdmusicSysUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysUser queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param ddmusicSysUser 查询条件
     * @param pageable       分页对象
     * @return 对象列表
     */
    List<DdmusicSysUser> queryAllByLimit(DdmusicSysUser ddmusicSysUser, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param ddmusicSysUser 查询条件
     * @return 总行数
     */
    long count(DdmusicSysUser ddmusicSysUser);

    /**
     * 新增数据
     *
     * @param ddmusicSysUser 实例对象
     * @return 影响行数
     */
    int insert(DdmusicSysUser ddmusicSysUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicSysUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DdmusicSysUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicSysUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DdmusicSysUser> entities);

    /**
     * 修改数据
     *
     * @param ddmusicSysUser 实例对象
     * @return 影响行数
     */
    int update(DdmusicSysUser ddmusicSysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

