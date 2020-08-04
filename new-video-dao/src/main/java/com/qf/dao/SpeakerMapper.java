package com.qf.dao;

import com.qf.pojo.Speaker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeakerMapper {
    List<Speaker> selectAll();
    void insertSpeaker(Speaker speaker);
    int deleteById(Integer id);
    int updateById(Speaker speaker);
}
