package com.hujq.majiang.dto;

import com.hujq.majiang.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private Long gmt_create;
    private Long gmt_modify;
    private Long creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String description;
    private String tag;
    private User user;
}
