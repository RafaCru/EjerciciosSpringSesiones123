package com.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans2.xml");


        UserService userService=context.getBean(UserService.class);
        userService.getImprime().ImprimeSaludo();
    }
}
