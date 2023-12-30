package com.blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil3 {
    public static void main(String[] args) {
        Post post1 = new Post();
        Post post2 = new Post();
        Post post3 = new Post();
        post1.setId(1);
        post1.setTitle("aaa");
        post1.setContent("aaaa");

        post2.setId(2);
        post2.setTitle("bbb");
        post2.setContent("bbbb");

        post3.setId(3);
        post3.setTitle("ccc");
        post3.setContent("cccc");

        List<Post> list = Arrays.asList(post1,post2,post3);
        List<PostDto> dtos = list.stream().map(MainUtil3::mapToDto).collect(Collectors.toList());
        for (PostDto dto:dtos) {
            System.out.println(dto.getId());
            System.out.println(dto.getTitle());
            System.out.println(dto.getContent());
        }


    }

    private static PostDto mapToDto(Post post) {
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        return dto;
    }
}
