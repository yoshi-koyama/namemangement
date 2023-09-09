package com.koyama.namemanagement;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {

    @Select("SELECT name FROM names")
    List<Name> findAll();
}
