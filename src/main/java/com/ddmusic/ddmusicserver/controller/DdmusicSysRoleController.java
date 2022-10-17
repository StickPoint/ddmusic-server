package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicSysRole;
import com.ddmusic.ddmusicserver.service.DdmusicSysRoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色表(DdmusicSysRole)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicSysRole")
public class DdmusicSysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicSysRoleService ddmusicSysRoleService;

    /**
     * 分页查询
     *
     * @param ddmusicSysRole 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicSysRole>> queryByPage(DdmusicSysRole ddmusicSysRole, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicSysRoleService.queryByPage(ddmusicSysRole, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicSysRole> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicSysRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicSysRole> add(DdmusicSysRole ddmusicSysRole) {
        return ResponseEntity.ok(this.ddmusicSysRoleService.insert(ddmusicSysRole));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicSysRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicSysRole> edit(DdmusicSysRole ddmusicSysRole) {
        return ResponseEntity.ok(this.ddmusicSysRoleService.update(ddmusicSysRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicSysRoleService.deleteById(id));
    }

}

