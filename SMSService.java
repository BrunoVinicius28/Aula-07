package org.example;

// Outra implementação concreta do Service
public class SMSService implements Service {
    @Override
    public void execute() {
        System.out.println("Enviando SMS...");
    }
}

