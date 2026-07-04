## Exercício: Padrão de projeto Adapter

Neste código, implementei o padrão "Adapter" para solucionar o problema de imcompatibilidade entre a interface com o método:

```bash
    void enviar(String mensagem)
``` 

E as classes/serviços externos (EmailServices e SmsService) que possuem métodos diferentes para enviar mensagem: 

```bash
    public void sendEmail(String texto)


    public void enviarSms(String msg)
``` 

A solução para incopatibilidade são classes "adaptadoras", que utilizam do contrato da interface para traduzir o método enviar de acordo com cada serviço.

EmailAdapter precisa de um construtor para uma injeção de dependência de um serviço de Email. O método da interface sendo sobrescrito vai obrigatoriamente receber uma mensagem pela variável "String mensagem" e passar essa variável como parâmetro para o método que originalmente é "sendEmail(String texto)". Na main, instanciamos um notificador, com "new EmailAdapter(new EmailService());" esclarecendo a criação de um novo adaptador juntamente de um novo serviço. Chamamos o método de enviar o todo o processo descrito anteriormente ocorre. 

O mesmo vale para o SMS.
