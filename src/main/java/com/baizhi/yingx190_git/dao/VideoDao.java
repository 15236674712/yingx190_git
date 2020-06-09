package com.baizhi.yingx190_git.dao;

import com.baizhi.yingx190_git.entity.Video;

import java.util.List;

public interface VideoDao {

    List<Video> queryAll();

    Video queryById(String id);
}
