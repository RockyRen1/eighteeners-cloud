package com.rocky.eighteeners.forum.sentinel.fallback;

import com.rocky.eighteeners.forum.common.Page;
import com.rocky.eighteeners.forum.sentinel.common.CustomFallback;
import org.springframework.http.ResponseEntity;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/8/6 22:57
 */
public class EssayContentFallback {

    public static ResponseEntity getEssayContents(String essayId, Page page) {
        return CustomFallback.defaultReturn();
    }
}
