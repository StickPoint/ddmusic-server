package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicSysDictionary;
import com.ddmusic.ddmusicserver.service.DdmusicSysDictionaryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统数据字典(DdmusicSysDictionary)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicSysDictionary")
public class DdmusicSysDictionaryController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicSysDictionaryService ddmusicSysDictionaryService;

    /**
     * 分页查询
     *
     * @param ddmusicSysDictionary 筛选条件
     * @param pageRequest          分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicSysDictionary>> queryByPage(DdmusicSysDictionary ddmusicSysDictionary, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicSysDictionaryService.queryByPage(ddmusicSysDictionary, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicSysDictionary> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicSysDictionaryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysDictionary 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicSysDictionary> add(DdmusicSysDictionary ddmusicSysDictionary) {
        return ResponseEntity.ok(this.ddmusicSysDictionaryService.insert(ddmusicSysDictionary));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicSysDictionary 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicSysDictionary> edit(DdmusicSysDictionary ddmusicSysDictionary) {
        return ResponseEntity.ok(this.ddmusicSysDictionaryService.update(ddmusicSysDictionary));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicSysDictionaryService.deleteById(id));
    }

}

