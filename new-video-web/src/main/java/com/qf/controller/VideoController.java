package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Video;
import com.qf.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<Video> videoList = videoService.findVideos();
        model.addAttribute("videoList",videoList);
        return "videoList";
    }


    @RequestMapping("findVideos")
    public Map findWords(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);

        List<Video> videos = videoService.findVideos();

        PageInfo<Video> pageInfo = new PageInfo<>(videos);

        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        //总记录数
        map.put("count", pageInfo.getTotal());
        //分页数据
        map.put("data", pageInfo.getList());

        return map;
    }

    @RequestMapping("deleteById")
    public int deleteById(Integer id) {
        return videoService.deleteById(id);
    }

    @RequestMapping("deleteByIds")
    public void deleteByIds(Integer[] ids) {
        videoService.deleteByIds(ids);
    }
}
