package com.unionman.nacos.controller;

import com.unionman.nacos.rpc.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinhu.yang
 * @date 2021/6/8 下午3:18
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @GetMapping("/hello")
    public String hello(){
        return "hello " + providerFeignClient.getName();
    }
}
