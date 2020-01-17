package com.syj.controller;

import com.syj.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author SYJ
 * @description: TODO
 * @date 2020/1/17
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "dept/add", dept, Boolean.class);
    }


    @RequestMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/get/" + id, Dept.class);
    }


    @RequestMapping("/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/list", List.class);
    }

}
