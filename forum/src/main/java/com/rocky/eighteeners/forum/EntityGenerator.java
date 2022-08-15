package com.rocky.eighteeners.forum;

import cn.org.atool.fluent.mybatis.metadata.DbType;
import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.Table;
import cn.org.atool.generator.annotation.Tables;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/4 20:41
 */
public class EntityGenerator {

    public static final String url = "jdbc:postgresql://192.168.225.142:5432/pie";

    public static void main(String[] args) throws Exception {
        FileGenerator.build(Empty.class);
    }

    @Tables(
            dbType = DbType.POSTGRE_SQL,
            url = url,
            username = "pg",
            password = "6789@jkl",
            srcDir = "repository/src/main/java",
            basePack = "com.rocky.eighteeners.repository",
            daoDir = "repository/src/main/java",
            tables = {@Table(value = {"essay", "essay_content", "essay_html"})},
            driver = "org.postgresql.Driver"
    )
    static class Empty {

    }
}
