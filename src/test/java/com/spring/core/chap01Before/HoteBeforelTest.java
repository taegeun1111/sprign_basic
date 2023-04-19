package com.spring.core.chap01Before;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoteBeforelTest {
    @Test
    void hotel(){
        Hotel hotel = new Hotel();
        hotel.inform();
    }
}