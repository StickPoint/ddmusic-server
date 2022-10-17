package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicUser;
import com.ddmusic.ddmusicserver.service.DdmusicUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ddmusic用户表(DdmusicUser)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:34
 */
@RestController
@RequestMapping("ddmusicUser")
public class DdmusicUserController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicUserService ddmusicUserService;

    /**
     * 分页查询
     *
     * @param ddmusicUser 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicUser>> queryByPage(DdmusicUser ddmusicUser, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicUserService.queryByPage(ddmusicUser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicUser> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicUser> add(DdmusicUser ddmusicUser) {
        return ResponseEntity.ok(this.ddmusicUserService.insert(ddmusicUser));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicUser> edit(DdmusicUser ddmusicUser) {
        return ResponseEntity.ok(this.ddmusicUserService.update(ddmusicUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicUserService.deleteById(id));
    }

}

