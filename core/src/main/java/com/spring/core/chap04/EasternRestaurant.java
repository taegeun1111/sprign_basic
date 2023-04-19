package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EasternRestaurant implements Restaurant {

//    @Autowired private Chef test;
    // 필드에 주입을 하는 것은 테스트할 때 사용하고 거의 사용하지 않는다.

    // 쉐프
    private Chef chef;

    // 요리 코스
    private Course course;

    @Autowired // 자동 주입해라
    public EasternRestaurant(
            @Qualifier("kc") Chef chef,
            Course course) {
        this.chef = chef;
        this.course = course;
    }

    // 요리를 주문하는 기능
    public void order() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
