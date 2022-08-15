package com.rocky.eighteeners.forum.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rocky Ren
 * @description <p>分页对象</p>
 * @date 2022/7/14 21:43
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Page implements Serializable {

    @ApiModelProperty("page")
    private Integer page;

    @ApiModelProperty("size")
    private Integer size;
}
