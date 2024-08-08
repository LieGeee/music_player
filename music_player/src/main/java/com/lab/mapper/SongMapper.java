package com.lab.mapper;

import com.lab.pojo.songs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SongMapper {

    @Select("SELECT * FROM Songs WHERE Title LIKE CONCAT('%', #{Title}, '%')")
    List<songs> findByTitle(String Title);

}
