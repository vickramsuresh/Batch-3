package com.sap.training.spring.restcontroller.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyCalc implements ICalc {

    private int memoryVariable = 0;

    @PostMapping("/memory/{value}")
    @Override
    public void setMemoryVariable(@PathVariable int value){
        // Set memery variable value
        memoryVariable = value;
    }

    @GetMapping("/add")
    public int add(@RequestParam int value1,@RequestParam int value2) {
        // Add two values
        return value1 + value2;
    }

    @GetMapping("/addMemoryValue")
    public int addWithMemoryValue(@RequestParam int value1,@RequestParam int value2) {
        return value1 + value2 + memoryVariable;
    }

    @Override
    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    @Override
    public int multiplyWithMemoryValue(int value1, int value2) {
        // Multiply two values and add memory variable to the result
        return ( value1 * value2 ) + memoryVariable;
    }

    @Override
    public int sub(int value1, int value2) {
        // Comment
        return value1 - value2;
    }
}
