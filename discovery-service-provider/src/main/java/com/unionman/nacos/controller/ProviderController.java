package com.unionman.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinhu.yang
 * @date 2021/6/8 下午2:57
 */
@Slf4j
@RestController
public class ProviderController {

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/name")
    public String getName(){
        log.info("被访问了");
        return "provider " + serverPort;
    }
}
