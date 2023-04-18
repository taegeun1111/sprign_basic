package com.spring.core.chap02.config;

import com.spring.core.chap02.*;

//호텔을 운영하기 위한 객체들을 만들어서
//호텔에 주입해주는 클래스
//스프링에서는 Spring Container라고 부르고,
//하위 개념들을 Bean Factory라고 부른다.
public class HotelManager {

    //Chef 객체를 생성
    public Chef chef(){
        return new KimuraChef();
    }

    //코스 객체를 생성
    public Course course(){
        return new EasternCourse();
    }

    //레스토랑 객체를 생성
    public Restaurant restaurant(){
        return new EasternRestaurant(chef(),course());
    }

    //호텔 객체를 생성
    public Hotel hotel(){
        return new Hotel(restaurant(),chef()); //생성자 주입

        /*
        Hotel hotel = new Hotel();  //수정자 주입
        hotel.setRestaurant(restaurant());
        hotel.setHeadChef(chef());

        return hotel;
        */
    }




}
