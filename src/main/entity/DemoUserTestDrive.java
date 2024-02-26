package edu.matc.demo.entity;

import lombok.extern.java.Log;

@Log
public class DemoUserTestDrive {
    public static void main(String[] args) {
        DemoUser demo = DemoUser.builder().firstName("Jeremy").lastName("Smith").password("password123").userID(233).build();
        //System.out.println(demo);
        log.info(demo.toString());
    }
}
