package net.hifor.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author IKin <br/>
 * @description 第一个springboot  <br/>
 * @date 2019/11/17 <br/>
 */
@RestController
public class HelloSpringbootController {

    /**
     * 第一个方法
     * @return
     */
    @GetMapping("/")
    public String hello() {
        return "Hello Spring boot!";
    }
}
