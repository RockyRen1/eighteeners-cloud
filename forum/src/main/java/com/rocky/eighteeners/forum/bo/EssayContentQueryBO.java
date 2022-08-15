package com.rocky.eighteeners.forum.bo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/16 21:51
 */
@Data
@Builder
public class EssayContentQueryBO implements Serializable {

    private Integer page;

    private Integer size;
}
