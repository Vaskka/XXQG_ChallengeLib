package com.vaskka.fun.xxqg.QGSearchBackend.dao;

import java.util.List;
import com.vaskka.fun.xxqg.QGSearchBackend.entity.ExerciseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: QGSearchBackend
 * @description: ExerciseDao
 * @author: Vaskka
 * @create: 2019/8/4 10:27 AM
 **/

@Repository
public interface ExerciseDao extends MongoRepository<ExerciseEntity, String> {

    List<ExerciseEntity> findByContentContaining(String key, Pageable pageable);
}
