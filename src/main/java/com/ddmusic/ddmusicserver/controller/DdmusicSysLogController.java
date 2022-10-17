package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicSysLog;
import com.ddmusic.ddmusicserver.service.DdmusicSysLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 顶点音乐后台日志(DdmusicSysLog)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicSysLog")
public class DdmusicSysLogController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicSysLogService ddmusicSysLogService;

    /**
     * 分页查询
     *
     * @param ddmusicSysLog 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicSysLog>> queryByPage(DdmusicSysLog ddmusicSysLog, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicSysLogService.queryByPage(ddmusicSysLog, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicSysLog> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicSysLogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicSysLog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicSysLog> add(DdmusicSysLog ddmusicSysLog) {
        return ResponseEntity.ok(this.ddmusicSysLogService.insert(ddmusicSysLog));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicSysLog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicSysLog> edit(DdmusicSysLog ddmusicSysLog) {
        return ResponseEntity.ok(this.ddmusicSysLogService.update(ddmusicSysLog));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicSysLogService.deleteById(id));
    }

}

