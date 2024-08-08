package com.lab.Service.Impl;

import com.lab.Service.UserService;
import com.lab.mapper.SongMapper;

import com.lab.pojo.songs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl implements UserService
{

    @Autowired
   private SongMapper songmapper;

    @Override
    public List<songs> findByMusic(String Title) {
        return songmapper.findByTitle(Title);
    }
}
