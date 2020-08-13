package com.raisecom.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/8/12 5:40 下午
 */
@RestController
@RequestMapping("/provider/v1")
@RefreshScope
public class ConfigController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(method = RequestMethod.GET, value = "/provider/{id}")
    public String  provider(@PathVariable("id") String id){
        System.out.println("providor port:" + port +",id=" + id);
        return "providor port:" + port +",id=" + id;
    }
}
