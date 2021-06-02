package com.example.demo.mapper.master;

import org.apache.ibatis.annotations.Select;

public interface MasterMapper {

    @Select("select count(1) from users")
    int count();
}
