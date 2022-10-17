package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicSysUserRole;
import com.ddmusic.ddmusicserver.service.DdmusicSysUserRoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DdmusicSysUserRole)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicSysUserRole")
public class DdmusicSysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicSysUserRoleService ddmusicSysUserRoleService;

    /**
     * 分页查询
     *
     * @param ddmusicSysUserRole 筛选条件
     * @param pageRequest        分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicSysUserRole>> queryByPage(DdmusicSysUserRole ddmusicSysUserRole, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicSysUserRoleService.queryByPage(ddmusicSysUserRole, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicSysUserRole> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicSysUserRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysUserRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicSysUserRole> add(DdmusicSysUserRole ddmusicSysUserRole) {
        return ResponseEntity.ok(this.ddmusicSysUserRoleService.insert(ddmusicSysUserRole));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicSysUserRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicSysUserRole> edit(DdmusicSysUserRole ddmusicSysUserRole) {
        return ResponseEntity.ok(this.ddmusicSysUserRoleService.update(ddmusicSysUserRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicSysUserRoleService.deleteById(id));
    }

}

