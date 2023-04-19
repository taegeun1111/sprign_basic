package com.spring.core.chap01;

public class EasternRestaurant implements Restaurant{
    //쉐프
    private Chef chef = new KimuraChef();

    //요리 코스
    private Course course = new EasternCourse();

    //요리를 주문하는 기능
    public void order(){
        System.out.println("아시안 요리를 주문합니다.");
        chef.cook();
    }



}
