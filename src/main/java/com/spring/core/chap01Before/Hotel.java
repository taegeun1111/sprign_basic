package com.spring.core.chap01Before;

public class Hotel {
    //레스토랑 객체에 의존
    private WesternRestaurant restaurant = new WesternRestaurant();

    //호텔의 정보를 알려주는 기능
    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은 %s입니다.\n"
        ,restaurant.getClass().getSimpleName());

        restaurant.order();
    }
}

//구체적인 객체에 의존하기 때문에 객체가 바뀌면 변경이 불가하다.

