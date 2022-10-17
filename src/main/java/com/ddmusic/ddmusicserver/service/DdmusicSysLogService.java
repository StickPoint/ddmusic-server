package com.ddmusic.ddmusicserver.service;

import com.ddmusic.ddmusicserver.entity.DdmusicSysLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 顶点音乐后台日志(DdmusicSysLog)表服务接口
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
public interface DdmusicSysLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DdmusicSysLog queryById(Long id);

    /**
     * 分页查询
     *
     * @param ddmusicSysLog 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    Page<DdmusicSysLog> queryByPage(DdmusicSysLog ddmusicSysLog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param ddmusicSysLog 实例对象
     * @return 实例对象
     */
    DdmusicSysLog insert(DdmusicSysLog ddmusicSysLog);

    /**
     * 修改数据
     *
     * @param ddmusicSysLog 实例对象
     * @return 实例对象
     */
    DdmusicSysLog update(DdmusicSysLog ddmusicSysLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
