package com.rocky.eighteeners.forum.sentinel.block;

import com.rocky.eighteeners.forum.bo.EssayQueryBO;
import com.rocky.eighteeners.forum.common.Page;
import com.rocky.eighteeners.forum.sentinel.common.CustomBlockHandler;
import org.springframework.http.ResponseEntity;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/8/6 22:57
 */
public class EssayBlockHandler {

    public static ResponseEntity page(EssayQueryBO query, Page page) {
        return CustomBlockHandler.defaultReturn();
    }
}
