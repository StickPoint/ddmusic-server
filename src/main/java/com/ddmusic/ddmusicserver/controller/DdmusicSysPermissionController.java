package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicSysPermission;
import com.ddmusic.ddmusicserver.service.DdmusicSysPermissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 权限表(DdmusicSysPermission)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicSysPermission")
public class DdmusicSysPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicSysPermissionService ddmusicSysPermissionService;

    /**
     * 分页查询
     *
     * @param ddmusicSysPermission 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicSysPermission>> queryByPage(DdmusicSysPermission ddmusicSysPermission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicSysPermissionService.queryByPage(ddmusicSysPermission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicSysPermission> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicSysPermissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysPermission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicSysPermission> add(DdmusicSysPermission ddmusicSysPermission) {
        return ResponseEntity.ok(this.ddmusicSysPermissionService.insert(ddmusicSysPermission));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicSysPermission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicSysPermission> edit(DdmusicSysPermission ddmusicSysPermission) {
        return ResponseEntity.ok(this.ddmusicSysPermissionService.update(ddmusicSysPermission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicSysPermissionService.deleteById(id));
    }

}

