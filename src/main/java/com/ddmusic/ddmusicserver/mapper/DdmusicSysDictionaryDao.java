package com.ddmusic.ddmusicserver.mapper;

import com.ddmusic.ddmusicserver.common.entity.DdmusicSysDictionary;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 系统数据字典(DdmusicSysDictionary)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-17 17:58:05
 */
public interface DdmusicSysDictionaryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysDictionary queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param ddmusicSysDictionary 查询条件
     * @param pageable             分页对象
     * @return 对象列表
     */
    List<DdmusicSysDictionary> queryAllByLimit(DdmusicSysDictionary ddmusicSysDictionary, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param ddmusicSysDictionary 查询条件
     * @return 总行数
     */
    long count(DdmusicSysDictionary ddmusicSysDictionary);

    /**
     * 新增数据
     *
     * @param ddmusicSysDictionary 实例对象
     * @return 影响行数
     */
    int insert(DdmusicSysDictionary ddmusicSysDictionary);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicSysDictionary> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DdmusicSysDictionary> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicSysDictionary> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DdmusicSysDictionary> entities);

    /**
     * 修改数据
     *
     * @param ddmusicSysDictionary 实例对象
     * @return 影响行数
     */
    int update(DdmusicSysDictionary ddmusicSysDictionary);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

