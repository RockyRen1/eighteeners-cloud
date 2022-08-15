package com.rocky.eighteeners.forum.bo;

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
 * @date 2022/7/16 21:42
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("essay query BO")
public class EssayQueryBO implements Serializable {

    @ApiModelProperty("author")
    private String author;

    @ApiModelProperty("title")
    private String title;

    @ApiModelProperty("type")
    private String type;
}
