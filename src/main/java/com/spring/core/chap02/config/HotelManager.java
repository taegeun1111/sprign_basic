package com.spring.core.chap02.config;

import com.spring.core.chap03.*;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotelManager {

    public Chef chef() {
        return new JannChef();
    }
    public Course easternCourse() {
        return new EasternCourse();
    }

    public Course frenchCourse() {
        return new FrenchCourse();
    }

    public Restaurant restaurant() {
        return new WesternRestaurant(chef(), frenchCourse());
    }

    public Hotel hotel() {
        return new Hotel(restaurant(), chef());
    }

}
