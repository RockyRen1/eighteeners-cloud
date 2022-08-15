package com.rocky.eighteeners.forum.common;

import cn.org.atool.fluent.mybatis.spring.MapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/4 21:41
 */
@Configuration
public class FluentMybatisConfiguration {

    @Bean
    public MapperFactory mapperFactory() {
        return new MapperFactory();
    }
}
