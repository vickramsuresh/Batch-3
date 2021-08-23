package com.sap.training.spring.restcontroller.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyApi1 {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hi Welcome";
    }

    @GetMapping("/Hi/{firstName}")
    public String welcome2(@PathVariable String firstName, @RequestParam(required = false) String lastName) {

        if(firstName == null) {
            throw new NullPointerException("First name is mandatory");
        }

        if(lastName != null){
            return "Hi " + firstName + " " + lastName;
        } else {
            return "Hi " + firstName;
        }

    }

    @PostMapping("/welcome")
    public PostReturnDetail welcomePost(@RequestBody PostDetail body) {
        if(body.firstName == null && body.lastName == null) {
            return new PostReturnDetail("Request Body is null", null, null);
        } else {
            return new PostReturnDetail("Welcome", body.firstName, body.lastName);
        }
    }

    @PatchMapping("/welcome")
    public String welcomePatch() {
        return "Patch method is called";
    }

    @DeleteMapping("/welcome")
    public String welcomeDelete() {
        return "Delete method is called";
    }



}
