package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    private Integer id;
    private String courseTitle;
    private String courseDesc;
    private Integer subjectId;

    private List<Video> videoList;

}
