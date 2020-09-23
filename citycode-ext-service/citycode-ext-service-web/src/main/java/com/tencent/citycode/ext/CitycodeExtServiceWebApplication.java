package com.tencent.citycode.ext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author annabian
 */
@ComponentScan("com.tencent")
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class CitycodeExtServiceWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitycodeExtServiceWebApplication.class, args);
    }

}