package com.ddmusic.ddmusicserver.mapper;

import com.ddmusic.ddmusicserver.common.entity.DdmusicUserFavorite;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 用户-喜欢-中间表
 * (DdmusicUserFavorite)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-17 17:58:05
 */
public interface DdmusicUserFavoriteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicUserFavorite queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param ddmusicUserFavorite 查询条件
     * @param pageable            分页对象
     * @return 对象列表
     */
    List<DdmusicUserFavorite> queryAllByLimit(DdmusicUserFavorite ddmusicUserFavorite, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param ddmusicUserFavorite 查询条件
     * @return 总行数
     */
    long count(DdmusicUserFavorite ddmusicUserFavorite);

    /**
     * 新增数据
     *
     * @param ddmusicUserFavorite 实例对象
     * @return 影响行数
     */
    int insert(DdmusicUserFavorite ddmusicUserFavorite);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicUserFavorite> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DdmusicUserFavorite> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicUserFavorite> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DdmusicUserFavorite> entities);

    /**
     * 修改数据
     *
     * @param ddmusicUserFavorite 实例对象
     * @return 影响行数
     */
    int update(DdmusicUserFavorite ddmusicUserFavorite);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

