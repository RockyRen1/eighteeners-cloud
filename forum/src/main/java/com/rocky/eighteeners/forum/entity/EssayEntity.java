package com.rocky.eighteeners.forum.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import cn.org.atool.fluent.mybatis.metadata.DbType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * EssayEntity: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@AllArgsConstructor
@NoArgsConstructor
@FluentMybatis(
    table = "essay",
    dbType = DbType.MYSQL
)
@ApiModel("essay")
@Builder
public class EssayEntity extends RichEntity {
  private static final long serialVersionUID = 1L;

  @TableId(
      value = "id",
      auto = false
  )
  @ApiModelProperty("id")
  private String id;

  @TableField("author")
  @ApiModelProperty("author")
  private String author;

  @TableField("source_url")
  @ApiModelProperty("sourceUrl")
  private String sourceUrl;

  @TableField("title")
  @ApiModelProperty("title")
  private String title;

  @TableField("type")
  @ApiModelProperty("type")
  private String type;

  @TableField("modified_time")
  @ApiModelProperty("modifiedTime")
  private LocalDateTime modifiedTime;

  @Override
  public final Class entityClass() {
    return EssayEntity.class;
  }
}
