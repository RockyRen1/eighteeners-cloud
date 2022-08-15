package com.rocky.eighteeners.forum.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.rocky.eighteeners.forum.bo.EssayQueryBO;
import com.rocky.eighteeners.forum.common.Page;
import com.rocky.eighteeners.forum.dao.intf.EssayDao;
import com.rocky.eighteeners.forum.entity.EssayEntity;
import com.rocky.eighteeners.forum.sentinel.block.EssayBlockHandler;
import com.rocky.eighteeners.forum.sentinel.fallback.EssayFallback;
import com.rocky.eighteeners.forum.vo.EssayVO;
import io.seata.spring.annotation.GlobalTransactional;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2021/12/27 20:04
 */
@Api("essay controller")
@RestController
@RequestMapping("/api/v1/essay")
public class EssayController {

    @Autowired
    private EssayDao essayDao;

    @ApiOperation(value = "page for essay", response = EssayVO.class)
    @GetMapping("/page")
    @SentinelResource(value = "essay_page",
            blockHandlerClass = EssayBlockHandler.class,
            blockHandler = "page",
            fallbackClass = EssayFallback.class,
            fallback = "page")
    public ResponseEntity<List<EssayVO>> page(EssayQueryBO query, Page page) {
        List<EssayVO> pageEssay = essayDao.getPage(query, page);
        return ResponseEntity.ok(pageEssay);
    }

    @PostMapping
    @GlobalTransactional
    public ResponseEntity<String> create(EssayEntity entity) {
        String id = essayDao.save(entity);
        return ResponseEntity.ok(id);
    }

}
