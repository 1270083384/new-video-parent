package com.qf.service.impl;

import com.qf.dao.SpeakerMapper;
import com.qf.pojo.Speaker;
import com.qf.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerMapper speakerMapper;
    @Override
    public List<Speaker> selectAll() {
        return speakerMapper.selectAll();
    }

    @Override
    public void insertSpeaker(Speaker speaker) {
        speakerMapper.insertSpeaker(speaker);
    }

    @Override
    public int deleteById(Integer id) {
        return speakerMapper.deleteById(id);
    }

    @Override
    public void updateById(Speaker speaker) {
        speakerMapper.updateById(speaker);
    }
}
