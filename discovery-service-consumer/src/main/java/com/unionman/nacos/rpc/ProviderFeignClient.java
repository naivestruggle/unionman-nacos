package com.unionman.nacos.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xinhu.yang
 * @date 2021/6/8 下午3:23
 */
@FeignClient(value = "discovery-service-provider")
public interface ProviderFeignClient {

    /**
     * 获取姓名
     *
     * @return 姓名
     */
    @GetMapping("/name")
    String getName();
}
