package com.unionman.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope 这个注解的作用:每次使用Spring容器中的bean的时候, 都会获得一个新的实例
 * @author xinhu.yang
 * @date 2021/6/9 下午2:40
 */
@RestController
public class ConfigController {

    @Value("${config.name}")
    private String name;

    @Autowired
    private Config config;

    @Autowired
    private TestRefreshScope testRefreshScope;

    @GetMapping("/name")
    public String getName(){
        return name;
    }

    @GetMapping("/config/name")
    public String getConfigName(){
        return config.getName();
    }

    @GetMapping("/refresh/name")
    public String getRefreshScope(){
        return testRefreshScope.getName();
    }

    @GetMapping("/refresh/common/name")
    public String getCommonRefreshScope(){
        return testRefreshScope.getCommonConfigName();
    }
}
