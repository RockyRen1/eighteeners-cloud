package com.rocky.eighteeners.forum.sentinel.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/8/6 22:47
 */
public class CustomBlockHandler {

    public static ResponseEntity defaultReturn() {
        return new ResponseEntity("Service is busy now, please refresh to try again.", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
