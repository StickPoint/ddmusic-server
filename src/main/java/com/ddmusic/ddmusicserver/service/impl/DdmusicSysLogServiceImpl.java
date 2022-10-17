package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicSysLog;
import com.ddmusic.ddmusicserver.mapper.DdmusicSysLogDao;
import com.ddmusic.ddmusicserver.service.DdmusicSysLogService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 顶点音乐后台日志(DdmusicSysLog)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
@Service("ddmusicSysLogService")
public class DdmusicSysLogServiceImpl implements DdmusicSysLogService {
    @Resource
    private DdmusicSysLogDao ddmusicSysLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicSysLog queryById(Long id) {
        return this.ddmusicSysLogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicSysLog 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicSysLog> queryByPage(DdmusicSysLog ddmusicSysLog, PageRequest pageRequest) {
        long total = this.ddmusicSysLogDao.count(ddmusicSysLog);
        return new PageImpl<>(this.ddmusicSysLogDao.queryAllByLimit(ddmusicSysLog, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysLog 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysLog insert(DdmusicSysLog ddmusicSysLog) {
        this.ddmusicSysLogDao.insert(ddmusicSysLog);
        return ddmusicSysLog;
    }

    /**
     * 修改数据
     *
     * @param ddmusicSysLog 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysLog update(DdmusicSysLog ddmusicSysLog) {
        this.ddmusicSysLogDao.update(ddmusicSysLog);
        return this.queryById(ddmusicSysLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicSysLogDao.deleteById(id) > 0;
    }
}
