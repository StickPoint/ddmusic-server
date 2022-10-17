package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicUserFavorite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 用户-喜欢-中间表
 * (DdmusicUserFavorite)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
public interface DdmusicUserFavoriteService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicUserFavorite queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicUserFavorite 筛选条件
     * @param pageRequest         分页对象
     * @return 查询结果
     */
    Page<DdmusicUserFavorite> queryByPage(DdmusicUserFavorite ddmusicUserFavorite, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicUserFavorite 实例对象
     * @return 实例对象
     */
    DdmusicUserFavorite insert(DdmusicUserFavorite ddmusicUserFavorite);

    /**
     * 修改数据
     *
     * @param ddmusicUserFavorite 实例对象
     * @return 实例对象
     */
    DdmusicUserFavorite update(DdmusicUserFavorite ddmusicUserFavorite);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
