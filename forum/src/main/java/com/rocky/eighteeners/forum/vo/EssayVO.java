package com.rocky.eighteeners.forum.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/16 21:41
 */
@Data
@Builder
@ApiModel("essay VO")
@NoArgsConstructor
@AllArgsConstructor
public class EssayVO implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("author")
    private String author;

    @ApiModelProperty("title")
    private String title;

    @ApiModelProperty("contentCount")
    private Integer contentCount;
}
