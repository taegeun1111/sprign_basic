package com.spring.core.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //cmd + Shift + T : 테스트 메서드 생성
    @Test
    void lombokTest(){
        Person p = new Person();
        p.setAddress("경기도");
        p.setAge(23);
        p.setNickName("홍길동");

        new Person("testNick","Incheon",44);

        System.out.println(p);
    }
}