package com.qf.service;

import com.qf.pojo.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> selectAll();
    void insertSpeaker(Speaker speaker);
    int deleteById(Integer id);
    void updateById(Speaker speaker);
}
