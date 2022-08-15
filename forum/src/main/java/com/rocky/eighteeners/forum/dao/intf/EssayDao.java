package com.rocky.eighteeners.forum.dao.intf;

import cn.org.atool.fluent.mybatis.base.IBaseDao;
import com.rocky.eighteeners.forum.bo.EssayQueryBO;
import com.rocky.eighteeners.forum.common.Page;
import com.rocky.eighteeners.forum.entity.EssayEntity;
import com.rocky.eighteeners.forum.vo.EssayVO;

import java.util.List;

/**
 * EssayDao: 数据操作接口
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
public interface EssayDao extends IBaseDao<EssayEntity> {

    List<EssayVO> getPage(EssayQueryBO query, Page page);
}
