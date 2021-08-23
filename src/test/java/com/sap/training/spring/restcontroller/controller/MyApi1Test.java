package com.sap.training.spring.restcontroller.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyApi1Test {

    private MyApi1 service = new MyApi1();

    @Test
    public void welcome(){
        String actual = service.welcome();
        Assertions.assertEquals("Hi Welcome", actual);
    }

    @Test
    public void getMethodWithPathVariableAndParameter(){
        String actual = service.welcome2("First", "Last");
        Assertions.assertEquals("Hi First Last", actual);
    }

    @Test
    public void getMethodWithPathVariableAndParameterWithNullValue(){
        String actual = service.welcome2("First", null);
        Assertions.assertEquals("Hi First", actual);
    }

    @Test
    public void getMethodWithPathVariableNullValue(){
        try {
            String actual = service.welcome2(null, "Last");
            Assertions.fail("Should throw error message if path variable is null");
        } catch (NullPointerException e) {

        } catch (Exception e){
            Assertions.fail("Should throw error Illegal Exception");
        }
    }

    @Test
    public void requestBody(){
        PostReturnDetail actual = service.welcomePost(new PostDetail());
        Assertions.assertEquals("Request Body is null", actual.getMessage());
        Assertions.assertNull(actual.getFirstName());
        Assertions.assertNull(actual.getLastName());
    }

    @Test
    public void requestBodyWithValue(){
        PostReturnDetail actual = service.welcomePost(new PostDetail("First Name", "Last Name"));
//        Assertions.assertEquals("Welcome", actual.getMessage(), "Message should contain: Welcome");
//        Assertions.assertNotNull(actual.getFirstName(), "First Name should not be null");
//        Assertions.assertNotNull(actual.getLastName(), "Last name should not be null");
//        Assertions.assertEquals("PostReturnDetail{message='Welcome', firstName='First Name', lastName='Last Name'}", actual.toString());


        PostReturnDetail exp = new PostReturnDetail("Welcome", "First Name", "Last Name");
        Assertions.assertEquals(exp,actual);

    }

}
