package com.project;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor // - takes care of all Dependency Injection behind
public class Java {

    OfficeHours officeHours;


    //Constructor Injection
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours is: " + (20 + officeHours.getHours()));
    }
}
