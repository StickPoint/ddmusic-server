package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicShareMusic;
import com.ddmusic.ddmusicserver.service.DdmusicShareMusicService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户分享的音乐表(DdmusicShareMusic)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicShareMusic")
public class DdmusicShareMusicController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicShareMusicService ddmusicShareMusicService;

    /**
     * 分页查询
     *
     * @param ddmusicShareMusic 筛选条件
     * @param pageRequest       分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicShareMusic>> queryByPage(DdmusicShareMusic ddmusicShareMusic, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicShareMusicService.queryByPage(ddmusicShareMusic, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicShareMusic> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicShareMusicService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicShareMusic 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicShareMusic> add(DdmusicShareMusic ddmusicShareMusic) {
        return ResponseEntity.ok(this.ddmusicShareMusicService.insert(ddmusicShareMusic));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicShareMusic 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicShareMusic> edit(DdmusicShareMusic ddmusicShareMusic) {
        return ResponseEntity.ok(this.ddmusicShareMusicService.update(ddmusicShareMusic));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicShareMusicService.deleteById(id));
    }

}

