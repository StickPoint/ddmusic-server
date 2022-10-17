package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicSysDictionary;
import com.ddmusic.ddmusicserver.mapper.DdmusicSysDictionaryDao;
import com.ddmusic.ddmusicserver.service.DdmusicSysDictionaryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 系统数据字典(DdmusicSysDictionary)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:21
 */
@Service("ddmusicSysDictionaryService")
public class DdmusicSysDictionaryServiceImpl implements DdmusicSysDictionaryService {
    @Resource
    private DdmusicSysDictionaryDao ddmusicSysDictionaryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicSysDictionary queryById(Long id) {
        return this.ddmusicSysDictionaryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicSysDictionary 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicSysDictionary> queryByPage(DdmusicSysDictionary ddmusicSysDictionary, PageRequest pageRequest) {
        long total = this.ddmusicSysDictionaryDao.count(ddmusicSysDictionary);
        return new PageImpl<>(this.ddmusicSysDictionaryDao.queryAllByLimit(ddmusicSysDictionary, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysDictionary 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysDictionary insert(DdmusicSysDictionary ddmusicSysDictionary) {
        this.ddmusicSysDictionaryDao.insert(ddmusicSysDictionary);
        return ddmusicSysDictionary;
    }

    /**
     * 修改数据
     *
     * @param ddmusicSysDictionary 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicSysDictionary update(DdmusicSysDictionary ddmusicSysDictionary) {
        this.ddmusicSysDictionaryDao.update(ddmusicSysDictionary);
        return this.queryById(ddmusicSysDictionary.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicSysDictionaryDao.deleteById(id) > 0;
    }
}
