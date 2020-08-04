package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Speaker implements Serializable  {
    private Integer id;
    private String speakerName;
    private String speakerDesc;
    private String speakerJob;
    private String headImgUrl;

}
