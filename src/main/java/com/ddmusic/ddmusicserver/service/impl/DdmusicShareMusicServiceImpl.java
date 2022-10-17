package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicShareMusic;
import com.ddmusic.ddmusicserver.mapper.DdmusicShareMusicDao;
import com.ddmusic.ddmusicserver.service.DdmusicShareMusicService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 用户分享的音乐表(DdmusicShareMusic)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
@Service("ddmusicShareMusicService")
public class DdmusicShareMusicServiceImpl implements DdmusicShareMusicService {
    @Resource
    private DdmusicShareMusicDao ddmusicShareMusicDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicShareMusic queryById(Long id) {
        return this.ddmusicShareMusicDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicShareMusic 筛选条件
     * @param pageRequest       分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicShareMusic> queryByPage(DdmusicShareMusic ddmusicShareMusic, PageRequest pageRequest) {
        long total = this.ddmusicShareMusicDao.count(ddmusicShareMusic);
        return new PageImpl<>(this.ddmusicShareMusicDao.queryAllByLimit(ddmusicShareMusic, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicShareMusic 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicShareMusic insert(DdmusicShareMusic ddmusicShareMusic) {
        this.ddmusicShareMusicDao.insert(ddmusicShareMusic);
        return ddmusicShareMusic;
    }

    /**
     * 修改数据
     *
     * @param ddmusicShareMusic 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicShareMusic update(DdmusicShareMusic ddmusicShareMusic) {
        this.ddmusicShareMusicDao.update(ddmusicShareMusic);
        return this.queryById(ddmusicShareMusic.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicShareMusicDao.deleteById(id) > 0;
    }
}
