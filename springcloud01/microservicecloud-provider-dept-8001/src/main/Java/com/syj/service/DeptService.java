package com.syj.service;

import com.syj.springcloud.entity.Dept;

import java.util.List;

/**
 * @author SYJ
 * @description: TODO
 * @date 2020/1/17
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();

}
