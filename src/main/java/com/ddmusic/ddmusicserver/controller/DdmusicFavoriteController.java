package com.ddmusic.ddmusicserver.controller;

import com.ddmusic.ddmusicserver.entity.DdmusicFavorite;
import com.ddmusic.ddmusicserver.service.DdmusicFavoriteService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DdmusicFavorite)表控制层
 *
 * @author makejava
 * @since 2022-10-17 17:57:33
 */
@RestController
@RequestMapping("ddmusicFavorite")
public class DdmusicFavoriteController {
    /**
     * 服务对象
     */
    @Resource
    private DdmusicFavoriteService ddmusicFavoriteService;

    /**
     * 分页查询
     *
     * @param ddmusicFavorite 筛选条件
     * @param pageRequest     分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<DdmusicFavorite>> queryByPage(DdmusicFavorite ddmusicFavorite, PageRequest pageRequest) {
        return ResponseEntity.ok(this.ddmusicFavoriteService.queryByPage(ddmusicFavorite, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DdmusicFavorite> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.ddmusicFavoriteService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param ddmusicFavorite 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<DdmusicFavorite> add(DdmusicFavorite ddmusicFavorite) {
        return ResponseEntity.ok(this.ddmusicFavoriteService.insert(ddmusicFavorite));
    }

    /**
     * 编辑数据
     *
     * @param ddmusicFavorite 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<DdmusicFavorite> edit(DdmusicFavorite ddmusicFavorite) {
        return ResponseEntity.ok(this.ddmusicFavoriteService.update(ddmusicFavorite));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.ddmusicFavoriteService.deleteById(id));
    }

}

