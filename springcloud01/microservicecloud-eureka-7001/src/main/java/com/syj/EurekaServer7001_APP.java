package com.syj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author SYJ
 * @description: TODO
 * @date 2020/1/17
 */
@SpringBootApplication
@EnableEurekaServer   // EurekaServer服务器端启动类，接受其他微服务注册进来
public class EurekaServer7001_APP {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_APP.class, args);
    }
}
