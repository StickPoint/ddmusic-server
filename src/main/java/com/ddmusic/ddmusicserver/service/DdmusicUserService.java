package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * ddmusic用户表(DdmusicUser)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
public interface DdmusicUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicUser queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicUser 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<DdmusicUser> queryByPage(DdmusicUser ddmusicUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicUser 实例对象
     * @return 实例对象
     */
    DdmusicUser insert(DdmusicUser ddmusicUser);

    /**
     * 修改数据
     *
     * @param ddmusicUser 实例对象
     * @return 实例对象
     */
    DdmusicUser update(DdmusicUser ddmusicUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
