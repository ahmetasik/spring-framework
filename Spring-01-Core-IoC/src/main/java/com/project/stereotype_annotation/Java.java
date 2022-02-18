package com.project.stereotype_annotation;

import org.springframework.stereotype.Component;

@Component    //If it's not your class use - @Bean (Integer, String...)
public class Java {

    public void getTeachingHours(){
        System.out.println("Total teaching hours : 250");
    }
}
