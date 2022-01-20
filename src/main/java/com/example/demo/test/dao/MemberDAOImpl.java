package com.example.demo.test.dao;

import com.example.demo.test.vo.MemberDTO;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import javax.inject.Inject;
import java.util.List;

@Repository
//DAO에서 사용하는 어노테이션, Component도 사용가능하다.
//sql을 쓸 수 없으므로 함수를 사용해서 명령을 표현

public class MemberDAOImpl implements MemberDAO{

    //mongodb에 접속하여 명령어를 실행하는 객체
    //Autowired 대신에 inject를 써도 된다.
    //Inject를 사용하려면 pom.xml에 라이브러리를 추가해 주어야 한다.
    //Inject 어노테이션을 쓰고 우클릭 후 fix Project Setup을 누르고 jar파일에대고
    //ok를 누르면 Inject를 사용할 수 있다.
    //의존성 주입
    @Inject
    //@Autowired
    private MongoTemplate mongoTemplate;
    //bean에 MongoTemplate을 리턴하는 메소드가 있었는데 이 메소드가 실행되어야
    //Mongo DB를 사용할 수 있기 때문에 의존관계를 주입시키는 것이다.
    //템플릿을 사용하기 위한 의존성 주입

    //mongodb의 컬렉션
    //record => document
    String COLLECTION_NAME="member";

    //login check
    @Override
    public MemberDTO loginCheck(String userid, String passwd) {
        //_id : Document의 식별자
        //키값 == userid, passwd = passwd check
        Query query = new Query(new Criteria("_id").is(userid).and("passwd").is(passwd));
        //mongoTemplate.find(쿼리, 리턴자료형, 컬렉션이름)
        List<MemberDTO> list = mongoTemplate.find(query, MemberDTO.class, COLLECTION_NAME);

        //collection_name은 테이블이름, 위의 결과 참일시 memberDTO반환

        if(list.size() > 0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public void join(MemberDTO dto){
        //document 생성
        //dto안에 들어있는값을 collection_name컬렉션에 저장
        mongoTemplate.insert(dto, COLLECTION_NAME);
    }
}
