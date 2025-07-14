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
