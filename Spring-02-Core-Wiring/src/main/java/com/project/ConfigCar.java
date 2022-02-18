package com.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car car = new Car();
        car.setMake("Honda");
        return car;
    }

    // Direct wiring
//    @Bean
//    Person person(){
//        Person person = new Person();
//        person.setName("Mike");
//        person.setCar(car());
//        return person;
//    }


//    AutoWiring
    @Bean
    Person person(Car car){
        Person person = new Person();
        person.setName("Mike");
        person.setCar(car);
        return person;
    }
}
