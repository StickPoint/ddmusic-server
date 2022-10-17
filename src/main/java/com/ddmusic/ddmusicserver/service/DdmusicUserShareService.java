package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicUserShare;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (DdmusicUserShare)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
public interface DdmusicUserShareService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicUserShare queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicUserShare 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<DdmusicUserShare> queryByPage(DdmusicUserShare ddmusicUserShare, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicUserShare 实例对象
     * @return 实例对象
     */
    DdmusicUserShare insert(DdmusicUserShare ddmusicUserShare);

    /**
     * 修改数据
     *
     * @param ddmusicUserShare 实例对象
     * @return 实例对象
     */
    DdmusicUserShare update(DdmusicUserShare ddmusicUserShare);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
