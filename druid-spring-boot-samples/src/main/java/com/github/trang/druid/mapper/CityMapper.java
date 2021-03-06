package com.github.trang.druid.mapper;

import com.github.trang.druid.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

    @Select("select * from city where state = #{state}")
    City findByState(@Param("state") String state);

    @Select("select * from city where id = #{id}")
    City findById(@Param("id") Long id);

}