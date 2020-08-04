package com.qf.service;

import com.qf.pojo.Video;

import java.util.List;

public interface VideoService {
    List<Video> findVideos();
    int deleteById(Integer id);
    void deleteByIds(Integer[] ids);
    public List<Video> findAll();
}
