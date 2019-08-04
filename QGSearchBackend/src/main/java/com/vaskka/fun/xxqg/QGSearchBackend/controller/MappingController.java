package com.vaskka.fun.xxqg.QGSearchBackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: QGSearchBackend
 * @description: MappingController
 * @author: Vaskka
 * @create: 2019/8/3 10:16 PM
 **/
@Controller
public class MappingController {
    @RequestMapping("/main")
    public String sayHello() {
        return "search.html";
    }
}
