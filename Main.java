package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando dependências manualmente
        Service emailService = new EmailService();
        Service smsService = new SMSService();

        // Injeção de dependência através do construtor
        Client emailClient = new Client(emailService);
        Client smsClient = new Client(smsService);

        // Processando com as diferentes dependências injetadas
        emailClient.process();  // Saída: Enviando e-mail...
        smsClient.process();    // Saída: Enviando SMS...
    }
}
