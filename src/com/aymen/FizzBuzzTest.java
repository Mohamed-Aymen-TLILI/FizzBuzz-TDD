package com.aymen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1IfNumbersIs1(){
        assertEquals("1", fizzBuzz.generate(1, 1));
    }

    @Test
    public void shouldReturn2IfNumbersIs2(){
        assertEquals("2",fizzBuzz.generate(2, 2));
    }
    @Test
    public void shouldReturnFizzIfNumbersIs3(){
        assertEquals("Fizz",fizzBuzz.generate(3, 3));
    }
    @Test
    public void shouldReturnFizzIfNumbersIs6(){
        assertEquals("Fizz",fizzBuzz.generate(6, 6));
    }
    @Test
    public void shouldReturnFizzIfNumbersIs5(){
        assertEquals("Buzz",fizzBuzz.generate(5, 5));
    }
    @Test
    public void shouldReturnFizzIfNumbersIs10(){
        assertEquals("Buzz",fizzBuzz.generate(10, 10));
    }
    @Test
    public void shouldReturnFizzIfNumbersIs15(){
        assertEquals("FizzBuzz",fizzBuzz.generate(15, 15));
    }
    @Test
    public void shouldReturnFizzIfNumbersIs30(){
        assertEquals("FizzBuzz",fizzBuzz.generate(30, 30));
    }
    @Test
    public void shouldReturn12IfNumbersIs12(){
        assertEquals("12",fizzBuzz.generate(1, 2));
    }
    @Test
    public void shouldReturn12FizzIfNumbersIs1To3(){
        assertEquals("12Fizz",fizzBuzz.generate(1, 3));
    }
    @Test
    public void shouldReturn12Fizz4BuzzFizzBuzzIfNumbersIs1To5(){
        assertEquals("12Fizz4Buzz",fizzBuzz.generate(1, 5));
    }
}