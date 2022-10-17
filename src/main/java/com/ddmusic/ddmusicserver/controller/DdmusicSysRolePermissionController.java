package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicSysRolePermission;
import com.ddmusic.ddmusicserver.service.DdmusicSysRolePermissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色权限表(DdmusicSysRolePermission)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicSysRolePermission")
public class DdmusicSysRolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicSysRolePermissionService ddmusicSysRolePermissionService;

    /**
     * 分页查询
     *
     * @param ddmusicSysRolePermission 筛选条件
     * @param pageRequest              分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicSysRolePermission>> queryByPage(DdmusicSysRolePermission ddmusicSysRolePermission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicSysRolePermissionService.queryByPage(ddmusicSysRolePermission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicSysRolePermission> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicSysRolePermissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysRolePermission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicSysRolePermission> add(DdmusicSysRolePermission ddmusicSysRolePermission) {
        return ResponseEntity.ok(this.ddmusicSysRolePermissionService.insert(ddmusicSysRolePermission));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicSysRolePermission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicSysRolePermission> edit(DdmusicSysRolePermission ddmusicSysRolePermission) {
        return ResponseEntity.ok(this.ddmusicSysRolePermissionService.update(ddmusicSysRolePermission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicSysRolePermissionService.deleteById(id));
    }

}

