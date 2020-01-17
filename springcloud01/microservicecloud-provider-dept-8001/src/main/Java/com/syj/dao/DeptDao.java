package com.syj.dao;

import com.syj.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author SYJ
 * @description: Dept接口
 * @date 2020/1/17
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById (Long id);

    public List<Dept> findAll();

}
