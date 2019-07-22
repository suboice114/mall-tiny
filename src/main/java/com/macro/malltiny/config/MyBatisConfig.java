package com.macro.malltiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置类
 */
@Configuration
@MapperScan("com.macro.malltiny.mbg.mapper")
public class MyBatisConfig {
}
