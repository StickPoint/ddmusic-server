package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicUserFavorite;
import com.ddmusic.ddmusicserver.service.DdmusicUserFavoriteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户-喜欢-中间表
 * (DdmusicUserFavorite)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:34
 */
@RestController
@RequestMapping("ddmusicUserFavorite")
public class DdmusicUserFavoriteController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicUserFavoriteService ddmusicUserFavoriteService;

    /**
     * 分页查询
     *
     * @param ddmusicUserFavorite 筛选条件
     * @param pageRequest         分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicUserFavorite>> queryByPage(DdmusicUserFavorite ddmusicUserFavorite, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicUserFavoriteService.queryByPage(ddmusicUserFavorite, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicUserFavorite> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicUserFavoriteService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicUserFavorite 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicUserFavorite> add(DdmusicUserFavorite ddmusicUserFavorite) {
        return ResponseEntity.ok(this.ddmusicUserFavoriteService.insert(ddmusicUserFavorite));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicUserFavorite 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicUserFavorite> edit(DdmusicUserFavorite ddmusicUserFavorite) {
        return ResponseEntity.ok(this.ddmusicUserFavoriteService.update(ddmusicUserFavorite));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicUserFavoriteService.deleteById(id));
    }

}

