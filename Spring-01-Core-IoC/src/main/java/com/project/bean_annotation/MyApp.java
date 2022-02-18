package com.project.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        ft.createAccount();

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();




        PartTimeMentor str = (PartTimeMentor) container.getBean("partTimeMentor");
        str.createAccount();

        System.out.println(str);

        PartTimeMentor str1 = (PartTimeMentor) container.getBean("partTimeMentor");
        str.createAccount();

        System.out.println(str1);

    }
}
