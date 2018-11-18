package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZHL on 2018/11/10.
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String getMsg(){
        return "this is product msg 1";
    }
}
