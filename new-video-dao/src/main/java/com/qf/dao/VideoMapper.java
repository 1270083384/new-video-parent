package com.qf.dao;

import com.qf.pojo.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoMapper {
    List<Video> findVideos();
    int deleteById(Integer id);
    void deleteByIds(Integer[] ids);
    List<Video> findAll();

}
