package com.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Creamos una instancia al contenedor
        // https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-instantiation
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo Imprimirsaludo = (Saludo) context.getBean("Saludo");

        String texto = Imprimirsaludo.HolaMundo();
        System.out.println(texto);


    }
}
