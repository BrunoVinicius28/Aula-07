package org.example;

// Uma implementação concreta do Service
public class EmailService implements Service {
    @Override
    public void execute() {
        System.out.println("Enviando e-mail...");
    }
}
