package com.vaskka.fun.xxqg.QGSearchBackend.controller;

import com.vaskka.fun.xxqg.QGSearchBackend.service.ExerciseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: QGSearchBackend
 * @description: MainController
 * @author: Vaskka
 * @create: 2019/8/3 10:08 PM
 **/

@Api(description = "查询接口")
@RestController
public class SearchController {

    @Resource
    private ExerciseService exerciseService;

    @ApiOperation(value = "上传作文")
    @RequestMapping(value = "/search/{content}", method = RequestMethod.GET)
    public Map<String, Object> upload(@PathVariable(value = "content") String content){

        Map<String, Object> map = new HashMap<>();

        map.put("code", 0);

        map.put("msg", "success");

        map.put("data", exerciseService.getList(content));

        return map;
    }

}
