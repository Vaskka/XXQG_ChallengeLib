package com.vaskka.fun.xxqg.QGSearchBackend.entity;


import java.util.List;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * @program: QGSearchBackend
 * @description: ExerciseEntity
 * @author: Vaskka
 * @create: 2019/8/4 10:25 AM
 **/
@Document(collection = "lib")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExerciseEntity {

    @Id
    private String _id;

    private String eid;

    private String content;

    private List<String> choose;
}
