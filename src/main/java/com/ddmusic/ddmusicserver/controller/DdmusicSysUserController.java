package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicSysUser;
import com.ddmusic.ddmusicserver.service.DdmusicSysUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户表(DdmusicSysUser)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicSysUser")
public class DdmusicSysUserController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicSysUserService ddmusicSysUserService;

    /**
     * 分页查询
     *
     * @param ddmusicSysUser 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicSysUser>> queryByPage(DdmusicSysUser ddmusicSysUser, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicSysUserService.queryByPage(ddmusicSysUser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicSysUser> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicSysUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicSysUser> add(DdmusicSysUser ddmusicSysUser) {
        return ResponseEntity.ok(this.ddmusicSysUserService.insert(ddmusicSysUser));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicSysUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicSysUser> edit(DdmusicSysUser ddmusicSysUser) {
        return ResponseEntity.ok(this.ddmusicSysUserService.update(ddmusicSysUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicSysUserService.deleteById(id));
    }

}

