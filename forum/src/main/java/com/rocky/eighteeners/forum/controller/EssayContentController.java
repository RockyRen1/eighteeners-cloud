package com.rocky.eighteeners.forum.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.rocky.eighteeners.forum.common.Page;
import com.rocky.eighteeners.forum.dao.intf.EssayContentDao;
import com.rocky.eighteeners.forum.entity.EssayContentEntity;
import com.rocky.eighteeners.forum.entity.EssayEntity;
import com.rocky.eighteeners.forum.sentinel.block.EssayContentBlockHandler;
import com.rocky.eighteeners.forum.sentinel.fallback.EssayContentFallback;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/16 20:56
 */
@Api("essay content controller")
@RestController
@RequestMapping("/api/v1")
public class EssayContentController {

    @Autowired
    private EssayContentDao essayContentDao;

    @ApiOperation(value = "contents of essay", response = EssayEntity.class)
    @GetMapping("/contents/page")
    @SentinelResource(value = "content_page",
            blockHandlerClass = EssayContentBlockHandler.class,
            blockHandler = "getEssayContents",
            fallbackClass = EssayContentFallback.class,
            fallback = "getEssayContents")
    public ResponseEntity<List<EssayContentEntity>> getEssayContents(
            @RequestParam(value = "essayId") String essayId,
            Page page) {
        List<EssayContentEntity> contents = essayContentDao.getPageByEssayId(essayId, page);
        return ResponseEntity.ok(contents);
    }
}
