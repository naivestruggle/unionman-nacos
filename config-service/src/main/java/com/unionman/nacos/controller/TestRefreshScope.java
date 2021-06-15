package com.unionman.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author xinhu.yang
 * @date 2021/6/9 下午4:36
 */
@Component
@RefreshScope
public class TestRefreshScope {
    @Value("${config.name}")
    private String name;

    @Value("${common.config.name}")
    private String commonConfigName;

    public String getName(){
        return "test refresh scope" + name;
    }

    public String getCommonConfigName(){
        return commonConfigName;
    }
}
