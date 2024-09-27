# Implementação de injeção de dependência em Java

### Este é um projeto simples em Java que demonstra o conceito de Injeção de Dependência (Dependency Injection) por meio de uma implementação manual. O projeto foca em separar a lógica de dependência de forma que as classes sejam mais reutilizáveis, testáveis e flexíveis.

## Funcionalidades
O projeto contém:

+ Uma interface Service, que define o comportamento comum para diferentes serviços.
+ Duas implementações de Service:
  + EmailService: Implementa um serviço que simula o envio de e-mails.
  + SMSService: Implementa um serviço que simula o envio de SMS.
  + Uma classe Client, que depende de um serviço (Service) injetado via construtor para executar sua lógica.
  + A classe Main, que demonstra como injetar diferentes implementações de Service no Client e executar seus métodos.

### Estrutura do Projeto
```java
src/
│
├── Main.java          // Ponto de entrada do aplicativo
├── Service.java       // Interface que define o contrato dos serviços
├── EmailService.java  // Implementação do serviço de e-mail
├── SMSService.java    // Implementação do serviço de SMS
└── Client.java        // Cliente que depende de um Service
```
## Como Executar
### Pré-requisitos
+ Java 8+ instalado.
+ IntelliJ IDEA ou qualquer IDE compatível com Java.
### Passos
1. Clone o repositório:
```
git clone https://github.com/BrunoVinicius28/Aula-07
```
2. Abra o projeto em sua IDE preferida.
3. Compile e execute a classe Main.

### Exemplo de Saída
```java
Enviando e-mail...
Enviando SMS...
```
## Explicação do Conceito
Injeção de Dependência é um padrão de design que permite que as dependências de uma classe sejam fornecidas por uma fonte externa, em vez de serem criadas diretamente pela própria classe. 

Neste exemplo:

+ A classe Client não cria instâncias de EmailService ou SMSService diretamente. Em vez disso, recebe a dependência de um Service via seu construtor.
+ Isso permite maior flexibilidade e facilita a troca de implementações, promovendo uma melhor separação de responsabilidades e tornando o código mais modular.
  
## Melhorias Futuras
+ Adicionar testes unitários para demonstrar a facilidade de testar classes com dependências injetadas.
+ Implementar a injeção de dependência usando um framework como Spring.
+ Expandir o projeto com outros tipos de serviços e diferentes formas de injeção (por setter, por interface).
  
## Contribuições
Sinta-se à vontade para abrir issues ou pull requests para melhorias e correções.

## Licença
Este projeto está licenciado sob a MIT License.
