package com.ddmusic.ddmusicserver.service.impl;

import com.ddmusic.ddmusicserver.entity.DdmusicUser;
import com.ddmusic.ddmusicserver.mapper.DdmusicUserDao;
import com.ddmusic.ddmusicserver.service.DdmusicUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * ddmusic用户表(DdmusicUser)表服务实现类
 *
 * @author makejava
 * @since 2022-10-17 17:53:22
 */
@Service("ddmusicUserService")
public class DdmusicUserServiceImpl implements DdmusicUserService {
    @Resource
    private DdmusicUserDao ddmusicUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DdmusicUser queryById(Long id) {
        return this.ddmusicUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param ddmusicUser 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<DdmusicUser> queryByPage(DdmusicUser ddmusicUser, PageRequest pageRequest) {
        long total = this.ddmusicUserDao.count(ddmusicUser);
        return new PageImpl<>(this.ddmusicUserDao.queryAllByLimit(ddmusicUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param ddmusicUser 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicUser insert(DdmusicUser ddmusicUser) {
        this.ddmusicUserDao.insert(ddmusicUser);
        return ddmusicUser;
    }

    /**
     * 修改数据
     *
     * @param ddmusicUser 实例对象
     * @return 实例对象
     */
    @Override
    public DdmusicUser update(DdmusicUser ddmusicUser) {
        this.ddmusicUserDao.update(ddmusicUser);
        return this.queryById(ddmusicUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ddmusicUserDao.deleteById(id) > 0;
    }
}
