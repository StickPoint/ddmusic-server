package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicUserShare;
import com.ddmusic.ddmusicserver.service.DdmusicUserShareService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DdmusicUserShare)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:34
 */
@RestController
@RequestMapping("ddmusicUserShare")
public class DdmusicUserShareController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicUserShareService ddmusicUserShareService;

    /**
     * 分页查询
     *
     * @param ddmusicUserShare 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicUserShare>> queryByPage(DdmusicUserShare ddmusicUserShare, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicUserShareService.queryByPage(ddmusicUserShare, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicUserShare> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicUserShareService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicUserShare 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicUserShare> add(DdmusicUserShare ddmusicUserShare) {
        return ResponseEntity.ok(this.ddmusicUserShareService.insert(ddmusicUserShare));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicUserShare 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicUserShare> edit(DdmusicUserShare ddmusicUserShare) {
        return ResponseEntity.ok(this.ddmusicUserShareService.update(ddmusicUserShare));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicUserShareService.deleteById(id));
    }

}

