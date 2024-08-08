package com.lab.Service;

import com.lab.pojo.songs;

import java.util.List;

public interface UserService {

    //根据部分音乐名查询内容
    List<songs> findByMusic(String Title);

}
