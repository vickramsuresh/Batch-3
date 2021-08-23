package com.sap.training.spring.restcontroller.controller;


import lombok.*;

import java.util.Objects;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
@Data
@AllArgsConstructor
public class PostReturnDetail {

    private String message;
    private String firstName;
    private String lastName;

}
