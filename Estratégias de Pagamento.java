package com.example.pedidos.service.pagamento;

import org.springframework.stereotype.Component;

@Component
public class Boleto implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Boleto.");
    }
}

@Component
public class CartaoCredito implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}

@Component
public class PayPal implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
    }
}
