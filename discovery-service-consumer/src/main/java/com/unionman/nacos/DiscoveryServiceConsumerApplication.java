package com.unionman.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xinhu.yang
 * @date 2021/6/8 下午3:16
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.unionman.nacos.rpc"})
public class DiscoveryServiceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceConsumerApplication.class, args);
    }
}
