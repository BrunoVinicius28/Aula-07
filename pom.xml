package org.example;

// Classe que depende de um Service para realizar alguma ação
public class Client {

    private Service service; // dependência

    // Injeção de dependência via construtor
    public Client(Service service) {
        this.service = service;
    }

    // Método para executar a lógica do serviço
    public void process() {
        service.execute();
    }
}
