package com.rocky.eighteeners.forum.sentinel.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/8/6 23:00
 */
public class CustomFallback {

    public static ResponseEntity defaultReturn() {
        return new ResponseEntity("Service error, please try again. If it still doesn't work, please contact us.",
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
