package com.ddmusic.ddmusicserver.mapper;

import com.ddmusic.ddmusicserver.common.entity.DdmusicFavorite;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (DdmusicFavorite)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-17 17:58:05
 */
public interface DdmusicFavoriteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicFavorite queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param ddmusicFavorite 查询条件
     * @param pageable        分页对象
     * @return 对象列表
     */
    List<DdmusicFavorite> queryAllByLimit(DdmusicFavorite ddmusicFavorite, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param ddmusicFavorite 查询条件
     * @return 总行数
     */
    long count(DdmusicFavorite ddmusicFavorite);

    /**
     * 新增数据
     *
     * @param ddmusicFavorite 实例对象
     * @return 影响行数
     */
    int insert(DdmusicFavorite ddmusicFavorite);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicFavorite> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DdmusicFavorite> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DdmusicFavorite> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DdmusicFavorite> entities);

    /**
     * 修改数据
     *
     * @param ddmusicFavorite 实例对象
     * @return 影响行数
     */
    int update(DdmusicFavorite ddmusicFavorite);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

