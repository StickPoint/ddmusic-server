package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicShareMusic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 用户分享的音乐表(DdmusicShareMusic)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
public interface DdmusicShareMusicService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicShareMusic queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicShareMusic 筛选条件
     * @param pageRequest       分页对象
     * @return 查询结果
     */
    Page<DdmusicShareMusic> queryByPage(DdmusicShareMusic ddmusicShareMusic, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicShareMusic 实例对象
     * @return 实例对象
     */
    DdmusicShareMusic insert(DdmusicShareMusic ddmusicShareMusic);

    /**
     * 修改数据
     *
     * @param ddmusicShareMusic 实例对象
     * @return 实例对象
     */
    DdmusicShareMusic update(DdmusicShareMusic ddmusicShareMusic);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
