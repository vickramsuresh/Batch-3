package com.sap.training.spring.restcontroller.controller;

public class PostDetail {

    public String firstName;
    public String lastName;

    public PostDetail(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PostDetail() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
