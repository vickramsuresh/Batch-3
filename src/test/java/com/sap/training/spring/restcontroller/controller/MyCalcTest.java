package com.sap.training.spring.restcontroller.controller;

import org.junit.jupiter.api.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyCalcTest {

    private static ICalc service;

    @BeforeEach
    public void setupTestClass() {
        service = new MyCalc();
        service.setMemoryVariable(5);
        System.out.println("New Instance created for Ical " + service);
    }

//    @BeforeAll
//    public static void setupTestClass() {
//        service = new MyCalc();
//        service.setMemoryVariable(5);
//        System.out.println("New Instance created for Ical " + service);
//    }

    @AfterEach
    public void cleanUp(){
        System.out.println("After each method is called");
    }

    @Test
    public void multiply(){
        System.out.println("Multiply");
        int actual = service.multiply(2,4);
        Assertions.assertEquals(8, actual);
    }

    @Test
    public void multiplyWithZero(){
        System.out.println("Multiply With zero");
        int actual = service.multiply(2,0);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void multiplyWithMemory(){
        System.out.println("Multiply with memory");
        service.setMemoryVariable(5);
        int actual = service.multiplyWithMemoryValue(2,5);
        Assertions.assertEquals(15, actual);
    }

    @Test
    public void multiplyWithMemoryAndNull(){
        System.out.println("Multiply with null");
        service.setMemoryVariable(5);
        int actual = service.multiplyWithMemoryValue(3,0);
        Assertions.assertEquals(5, actual);
    }

}
