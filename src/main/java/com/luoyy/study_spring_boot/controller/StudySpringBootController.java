package com.luoyy.study_spring_boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>版本: </p>
 * <p>日期: 18-10-25</p>
 * <p>作者: LuoYangyang</p>
 * <pre>描述: </pre>
 * <pre>版权: luosir</pre>
 *
 * @author LuoYangyang
 */
@RestController
public class StudySpringBootController {
    @Value("${people}")
    private String people;


    @RequestMapping("/hello")
    public String say(){
        return people+"ni hao";
    }
}
