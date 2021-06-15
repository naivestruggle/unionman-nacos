package com.unionman.nacos.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xinhu.yang
 * @date 2021/6/9 下午3:41
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "config")
public class Config {
    private String name;
}
