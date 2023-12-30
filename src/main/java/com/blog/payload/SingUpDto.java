package com.blog.payload;

import lombok.Data;

@Data
public class SingUpDto {

    private String name;
    private String email;
    private String username;
    private String password;
}
