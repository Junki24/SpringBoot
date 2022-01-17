package com.example.demo.test;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PostsModelListener extends AbstractMongoEventListener<Posts> {

    private final SequenceGeneratorService sequenceGeneratorService;

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Posts> event){
        event.getSource().setId(sequenceGeneratorService.generateSequence(Posts.SEQUENCE_NAME));
    }
}
