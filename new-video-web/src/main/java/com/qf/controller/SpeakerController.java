package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Speaker;
import com.qf.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("speaker")
public class SpeakerController {
    @Autowired
    private SpeakerService speakerService;

    @RequestMapping("findSpeakers")
    public Map findWords(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);

        List<Speaker> speakers = speakerService.selectAll();

        PageInfo<Speaker> pageInfo = new PageInfo<>(speakers);

        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        //总记录数
        map.put("count", pageInfo.getTotal());
        //分页数据
        map.put("data", pageInfo.getList());

        return map;
    }

    @RequestMapping("findAll")
    public List<Speaker> findAll() {
        return speakerService.selectAll();
    }

    @RequestMapping("insertSpeaker")
    public void insertSpeaker(Speaker speaker) {
        speakerService.insertSpeaker(speaker);
    }

    @RequestMapping("deleteById")
    public int deleteById(Integer id) {
        return speakerService.deleteById(id);
    }

    @RequestMapping("updateById")
    public void updateById(Speaker speaker) {
        speakerService.updateById(speaker);
    }
}

