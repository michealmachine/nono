package com._12306.back.controller;

import com._12306.back.common.R;
import com._12306.back.entity.Tests;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@Tag(name = "用户管理")
public class ControllerTest {
    @GetMapping("/{id}")
    public String test(@PathVariable("id") Integer id){
        return id.toString();
    }
    @PostMapping
    public R<Tests> login(@RequestBody Tests tests){
        System.out.println(tests);
        return R.success(tests);
    }

}
