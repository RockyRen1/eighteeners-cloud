package com.rocky.eighteeners.forum.bo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/16 21:48
 */
@Data
@Builder
public class EssayContentBO implements Serializable {

    private String id;

    private String author;

    private String content;

}
