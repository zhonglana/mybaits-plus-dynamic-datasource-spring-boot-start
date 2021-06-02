package com.example.demo.mapper.spc;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Select;

@DS("spc")
public interface SpcMapper {

    @Select("select count(1) from t_area")
    int count();
}
