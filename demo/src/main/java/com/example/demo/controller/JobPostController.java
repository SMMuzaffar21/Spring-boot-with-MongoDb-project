package com.example.demo.controller;

import com.example.demo.models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class JobPostController {

    @Autowired
    PostRepository postRepository;

    @RequestMapping("/")
    @ResponseBody
    public String homePage(){
        return "This Is Your Home Page";
    }

    @GetMapping ("/posts")
    public List<Post> posts(){
        return postRepository.findAll();
    }

    @PostMapping("/post")
    public Post addJobPost(Post post){
        return postRepository.save(post);
    }
}
