package com.example.demo.src.post.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostPostsReq {
    private int userIdx;
    private String content;
    private List<PostImgUrlsReq> postImgUrls;

    public PostPostsReq() {

    }
}
