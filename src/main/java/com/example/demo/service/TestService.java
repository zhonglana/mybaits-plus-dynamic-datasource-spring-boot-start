package com.example.demo.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.demo.mapper.master.MasterMapper;
import com.example.demo.mapper.spc.SpcMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    @Resource
    private MasterMapper masterMapper;
    @Resource
    private SpcMapper spcMapper;

    public Object test(){
        Map<String ,Object> map = new HashMap<>();
        map.put("1", master());
        map.put("2", spc());
        return map;
    }

    public Object master(){
        return masterMapper.count();
    }

    public int spc(){
        return spcMapper.count();
    }
}
