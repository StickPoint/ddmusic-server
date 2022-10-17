package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicUserShare;
import com.ddmusic.ddmusicserver.mapper.DdmusicUserShareDao;
import com.ddmusic.ddmusicserver.service.DdmusicUserShareService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (DdmusicUserShare)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
@Service("ddmusicUserShareService")
public class DdmusicUserShareServiceImpl implements DdmusicUserShareService {
    @Resource
    private DdmusicUserShareDao ddmusicUserShareDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicUserShare queryById(Long id) {
        return this.ddmusicUserShareDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicUserShare 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicUserShare> queryByPage(DdmusicUserShare ddmusicUserShare, PageRequest pageRequest) {
        long total = this.ddmusicUserShareDao.count(ddmusicUserShare);
        return new PageImpl<>(this.ddmusicUserShareDao.queryAllByLimit(ddmusicUserShare, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicUserShare 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicUserShare insert(DdmusicUserShare ddmusicUserShare) {
        this.ddmusicUserShareDao.insert(ddmusicUserShare);
        return ddmusicUserShare;
    }

    /**
     * 修改数据
     *
     * @param ddmusicUserShare 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicUserShare update(DdmusicUserShare ddmusicUserShare) {
        this.ddmusicUserShareDao.update(ddmusicUserShare);
        return this.queryById(ddmusicUserShare.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicUserShareDao.deleteById(id) > 0;
    }
}
