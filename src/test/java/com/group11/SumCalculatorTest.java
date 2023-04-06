package com.group11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    public void ifNumberIs1() {
//        When
        int result = sumCalculator.sum(1);
//        Then
        assertEquals(1,result);
    }

    @Test
    public void ifNumberIs3() {
//        When
        int result = sumCalculator.sum(3);
//        Then
        assertEquals(6,result);
    }

    @Test void getExceptions(){
        assertThrows(IllegalArgumentException.class,()->{
            sumCalculator.sum(0);
        });
    }
}