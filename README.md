Descrição do Projeto
Sistema de Gerenciamento de Pedidos:

Os clientes podem criar pedidos e escolher entre diferentes métodos de pagamento (cartão de crédito, boleto ou PayPal).
Após a criação de um pedido, todos os observadores (como serviços de notificação ou outros sistemas) são notificados.
O sistema usa o padrão Singleton para gerenciar o repositório de pedidos.
Padrões no Projeto
Singleton:

O repositório de pedidos será implementado como um Singleton usando as abstrações do Spring.
Factory Method:

Um método será implementado para criar instâncias de estratégias de pagamento (cartão, boleto, PayPal).
Strategy:

Diferentes estratégias de pagamento serão implementadas.
Observer:

Observadores serão registrados para serem notificados quando um novo pedido for criado.


Testando o Sistema
Inicie o Spring Boot:

Execute a aplicação com PedidosApplication.java.
Crie um Pedido:

Use o Postman ou curl para enviar uma requisição POST:
curl -X POST "http://localhost:8080/pedidos?id=1&descricao=Notebook&valor=2500.0&tipoPagamento=cartao"


Verifique os Logs:

O console exibirá o método de pagamento utilizado.
