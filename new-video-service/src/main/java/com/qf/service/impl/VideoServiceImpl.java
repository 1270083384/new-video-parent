package com.qf.service.impl;

import com.qf.dao.VideoMapper;
import com.qf.pojo.Video;
import com.qf.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findVideos() {
        return videoMapper.findVideos();
    }

    @Override
    public int deleteById(Integer id) {
        return videoMapper.deleteById(id);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        videoMapper.deleteByIds(ids);
    }

    @Override
    public List<Video> findAll(){
        return videoMapper.findAll();
    }
}
