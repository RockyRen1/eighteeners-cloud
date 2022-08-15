package com.rocky.eighteeners.forum.dao.impl;

import com.rocky.eighteeners.forum.common.Page;
import com.rocky.eighteeners.forum.dao.base.EssayContentBaseDao;
import com.rocky.eighteeners.forum.dao.intf.EssayContentDao;
import com.rocky.eighteeners.forum.entity.EssayContentEntity;
import com.rocky.eighteeners.forum.wrapper.EssayContentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EssayContentDaoImpl: 数据操作接口实现
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
@Repository
public class EssayContentDaoImpl extends EssayContentBaseDao implements EssayContentDao {

    @Override
    public List<EssayContentEntity> getPageByEssayId(String essayId, Page page) {
        return listEntity(new EssayContentQuery()
                .selectAll()
                .where()
                .essayId().eq(essayId)
                .end()
                .limit(page.getPage() * page.getSize(), page.getSize())
                .orderBy().order().asc().end());
    }
}
