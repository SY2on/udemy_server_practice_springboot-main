package com.example.demo.src.auth.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostLoginReq {
    private String email;
    private String password;

    public PostLoginReq() {

    }
}

