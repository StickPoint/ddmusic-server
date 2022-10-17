package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicFavorite;
import com.ddmusic.ddmusicserver.mapper.DdmusicFavoriteDao;
import com.ddmusic.ddmusicserver.service.DdmusicFavoriteService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (DdmusicFavorite)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:20
 */
@Service("ddmusicFavoriteService")
public class DdmusicFavoriteServiceImpl implements DdmusicFavoriteService {
    @Resource
    private DdmusicFavoriteDao ddmusicFavoriteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicFavorite queryById(Long id) {
        return this.ddmusicFavoriteDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicFavorite 筛选条件
     * @param pageRequest     分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicFavorite> queryByPage(DdmusicFavorite ddmusicFavorite, PageRequest pageRequest) {
        long total = this.ddmusicFavoriteDao.count(ddmusicFavorite);
        return new PageImpl<>(this.ddmusicFavoriteDao.queryAllByLimit(ddmusicFavorite, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicFavorite 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicFavorite insert(DdmusicFavorite ddmusicFavorite) {
        this.ddmusicFavoriteDao.insert(ddmusicFavorite);
        return ddmusicFavorite;
    }

    /**
     * 修改数据
     *
     * @param ddmusicFavorite 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicFavorite update(DdmusicFavorite ddmusicFavorite) {
        this.ddmusicFavoriteDao.update(ddmusicFavorite);
        return this.queryById(ddmusicFavorite.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicFavoriteDao.deleteById(id) > 0;
    }
}
