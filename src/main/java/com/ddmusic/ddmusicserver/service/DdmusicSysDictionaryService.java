package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicSysDictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 系统数据字典(DdmusicSysDictionary)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
public interface DdmusicSysDictionaryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysDictionary queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicSysDictionary 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    Page<DdmusicSysDictionary> queryByPage(DdmusicSysDictionary ddmusicSysDictionary, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicSysDictionary 实例对象
     * @return 实例对象
     */
    DdmusicSysDictionary insert(DdmusicSysDictionary ddmusicSysDictionary);

    /**
     * 修改数据
     *
     * @param ddmusicSysDictionary 实例对象
     * @return 实例对象
     */
    DdmusicSysDictionary update(DdmusicSysDictionary ddmusicSysDictionary);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
