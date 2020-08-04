package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video implements Serializable {
    private Integer id;
    private String title;
    private String detail;
    private Integer time;
    private Integer speakerId;
    private Integer courseId;
    private String videoUrl;
    private String imageUrl;
    private Integer playNum;

    private Speaker speaker;
    private Course course;

}
