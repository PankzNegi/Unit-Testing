package com.testing.tutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Here, we have bunch of clear Scenario that need to be tested
//Each separate scenario we come up with should be tested in their own test methods
//Here we can't combine multiple scenario in single test method

class GraderTest {
    @Test
    void fiftyNineShouldReturnF()
    {
        var grader=new Grader();
        assertEquals('F',grader.determineLetterGrade(59));

    }
    @Test
    void sixtyNineShouldReturnD()
    {
        var grader=new Grader();
        assertEquals('D',grader.determineLetterGrade(69));

    }
    @Test
    void seventyNineShouldReturnC()
    {
        var grader=new Grader();
        assertEquals('C',grader.determineLetterGrade(79));

    }
    @Test
    void eightyNineShouldReturnB()
    {
        var grader=new Grader();
        assertEquals('B',grader.determineLetterGrade(89));

    }
    @Test
    void eightyNineShouldReturnA()
    {
        var grader=new Grader();
        assertEquals('A',grader.determineLetterGrade(99));

    }
    @Test
    void eightyShouldReturnB() //Edge case
    {
        var grader=new Grader();
        assertEquals('B',grader.determineLetterGrade(80));
    }
    @Test
    void seventyShouldReturnC() //Edge case
    {
        var grader=new Grader();
        assertEquals('C',grader.determineLetterGrade(70));
    }
    @Test
    void sixtyShouldReturnD() //Edge case
    {
        var grader=new Grader();
        assertEquals('D',grader.determineLetterGrade(60));
    }
    @Test
    void zeroShouldReturnD() //Edge case
    {
        var grader=new Grader();
        assertEquals('F',grader.determineLetterGrade(0));
    }
    @Test
    void negativeShouldThrowException()
    {
        var grader=new Grader();
        assertThrows(IllegalArgumentException.class,
                () ->
        {
            grader.determineLetterGrade(-7);
        });

    }

}
//Strict set of unit test that are guaranteeing the proper functionality of code "edge case scenario"