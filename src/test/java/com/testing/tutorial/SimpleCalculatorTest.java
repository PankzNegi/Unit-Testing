package com.testing.tutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoFour()
    {
        var calc=new SimpleCalculator();  //local variable inference
        assertEquals(4,calc.add(2,2)); //Test will pass coz of * operator
       // assertTrue(calc.add(2,2)==4);
    }
    @Test
    void threePlusSevenTen()
    {
        var calc=new SimpleCalculator();
        assertEquals(10,calc.add(3,7)); //Failing test
    }




}