package com.rocky.eighteeners.forum.dao.impl;

import cn.org.atool.fluent.mybatis.base.crud.JoinBuilder;
import cn.org.atool.fluent.mybatis.base.free.FreeQuery;
import cn.org.atool.fluent.mybatis.segment.JoinQuery;
import com.rocky.eighteeners.forum.bo.EssayQueryBO;
import com.rocky.eighteeners.forum.common.Page;
import com.rocky.eighteeners.forum.dao.base.EssayBaseDao;
import com.rocky.eighteeners.forum.dao.intf.EssayDao;
import com.rocky.eighteeners.forum.entity.EssayEntity;
import com.rocky.eighteeners.forum.vo.EssayVO;
import com.rocky.eighteeners.forum.wrapper.EssayContentQuery;
import com.rocky.eighteeners.forum.wrapper.EssayQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EssayDaoImpl: 数据操作接口实现
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
@Repository
public class EssayDaoImpl extends EssayBaseDao implements EssayDao {


    @Override
    public List<EssayVO> getPage(EssayQueryBO query, Page page) {
        JoinQuery joinQuery = JoinBuilder.<EssayQuery>from(
                new EssayQuery()
                        .select
                        .id()
                        .author()
                        .title()
                        .end()
                        .where()
                        .eqByEntity(EssayEntity
                                .builder()
                                .author(query.getAuthor())
                                .title(query.getTitle())
                                .type(query.getType())
                                .build())
                        .end()
                        .orderBy().modifiedTime().desc().end())
                .leftJoin(
                        new FreeQuery(
                                new EssayContentQuery()
                                        .select
                                        .essayId("essayId")
                                        .count("contentCount")
                                        .end()
                                        .groupBy.essayId()
                                        .end(), "content")
                        .select
                        .apply("contentCount")
                        .end()
                        )
                .on(l -> l.where.id(), r -> r.where.apply("essayId"))
                .endJoin()
                .limit(page.getPage() * page.getSize(), page.getSize())
                .build();
        return mapper.listPoJos(EssayVO.class, joinQuery);
    }
}
