package com.vaskka.fun.xxqg.QGSearchBackend.service;

import java.util.List;
import com.vaskka.fun.xxqg.QGSearchBackend.dao.ExerciseDao;
import com.vaskka.fun.xxqg.QGSearchBackend.entity.ExerciseEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: QGSearchBackend
 * @description: ExerciseService
 * @author: Vaskka
 * @create: 2019/8/4 10:29 AM
 **/

@Service
public class ExerciseService {

    @Resource
    private ExerciseDao exerciseDao;

    public List<ExerciseEntity> getList(String key) {
        return exerciseDao.findByContentContaining(key, PageRequest.of(0, 10));

    }

}
