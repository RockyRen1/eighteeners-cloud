package com.rocky.eighteeners.forum.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/17 19:15
 */
@Data
@Builder
public class EssayContentVO {

    private String id;

    private String author;

    private String content;
}
