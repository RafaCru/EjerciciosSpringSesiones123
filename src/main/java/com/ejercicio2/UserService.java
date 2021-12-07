package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService Imprime ;

    public UserService(NotificationService imprime) {
        Imprime = imprime;
    }

    public NotificationService getImprime() {
        return Imprime;
    }

    public void setImprime(NotificationService imprime) {
        Imprime = imprime;
    }
}