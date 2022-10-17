package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicUserFavorite;
import com.ddmusic.ddmusicserver.mapper.DdmusicUserFavoriteDao;
import com.ddmusic.ddmusicserver.service.DdmusicUserFavoriteService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 用户-喜欢-中间表
 * (DdmusicUserFavorite)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
@Service("ddmusicUserFavoriteService")
public class DdmusicUserFavoriteServiceImpl implements DdmusicUserFavoriteService {
    @Resource
    private DdmusicUserFavoriteDao ddmusicUserFavoriteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicUserFavorite queryById(Long id) {
        return this.ddmusicUserFavoriteDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicUserFavorite 筛选条件
     * @param pageRequest         分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicUserFavorite> queryByPage(DdmusicUserFavorite ddmusicUserFavorite, PageRequest pageRequest) {
        long total = this.ddmusicUserFavoriteDao.count(ddmusicUserFavorite);
        return new PageImpl<>(this.ddmusicUserFavoriteDao.queryAllByLimit(ddmusicUserFavorite, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicUserFavorite 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicUserFavorite insert(DdmusicUserFavorite ddmusicUserFavorite) {
        this.ddmusicUserFavoriteDao.insert(ddmusicUserFavorite);
        return ddmusicUserFavorite;
    }

    /**
     * 修改数据
     *
     * @param ddmusicUserFavorite 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicUserFavorite update(DdmusicUserFavorite ddmusicUserFavorite) {
        this.ddmusicUserFavoriteDao.update(ddmusicUserFavorite);
        return this.queryById(ddmusicUserFavorite.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicUserFavoriteDao.deleteById(id) > 0;
    }
}
