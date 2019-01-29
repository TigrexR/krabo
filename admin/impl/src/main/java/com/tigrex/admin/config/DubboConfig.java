package com.tigrex.admin.config;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo
@DubboComponentScan(basePackages = {"com.tigrex.web.service.impl"})
public class DubboConfig {
}
