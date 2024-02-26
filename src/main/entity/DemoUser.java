package edu.matc.demo.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
public class DemoUser {
    private String firstName;
    private String lastName;
    private String password;
    private int userID;
}
