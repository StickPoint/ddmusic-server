package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicFavorite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (DdmusicFavorite)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:20
 */
public interface DdmusicFavoriteService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicFavorite queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicFavorite 筛选条件
     * @param pageRequest     分页对象
     * @return 查询结果
     */
    Page<DdmusicFavorite> queryByPage(DdmusicFavorite ddmusicFavorite, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicFavorite 实例对象
     * @return 实例对象
     */
    DdmusicFavorite insert(DdmusicFavorite ddmusicFavorite);

    /**
     * 修改数据
     *
     * @param ddmusicFavorite 实例对象
     * @return 实例对象
     */
    DdmusicFavorite update(DdmusicFavorite ddmusicFavorite);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
