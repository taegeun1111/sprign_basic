package com.spring.core.chap01Before;

public class WesternRestaurant {
    //쉐프
    private JannChef chef = new JannChef();

    //요리 코스
    private FrenchCourse course = new FrenchCourse();

    //요리를 주문하는 기능
    public void order(){
        System.out.println("서양 요리를 주문합니다.");
        chef.cook();
    }



}
