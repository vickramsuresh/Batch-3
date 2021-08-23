package com.sap.training.spring.restcontroller.controller;

import org.springframework.web.bind.annotation.PathVariable;

public interface ICalc {

    public void setMemoryVariable( int value);

    public int multiply(int value1, int value2);

    public int multiplyWithMemoryValue(int value1, int value2);

    public int sub(int value1, int value2);

}
