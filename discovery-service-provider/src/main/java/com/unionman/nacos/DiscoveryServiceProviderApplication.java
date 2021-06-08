package com.unionman.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务注册中心示例 - 服务提供者
 * @author xinhu.yang
 * @date 2021/6/8 下午2:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceProviderApplication.class, args);
    }
}
