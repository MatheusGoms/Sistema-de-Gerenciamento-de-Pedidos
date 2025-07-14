package com.example.pedidos.service.fabrica;

import com.example.pedidos.service.pagamento.Boleto;
import com.example.pedidos.service.pagamento.CartaoCredito;
import com.example.pedidos.service.pagamento.PagamentoStrategy;
import com.example.pedidos.service.pagamento.PayPal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PagamentoFactory {

    @Autowired
    private Boleto boleto;

    @Autowired
    private CartaoCredito cartaoCredito;

    @Autowired
    private PayPal paypal;

    public PagamentoStrategy getPagamento(String tipo) {
        switch (tipo.toLowerCase()) {
            case "boleto":
                return boleto;
            case "cartao":
                return cartaoCredito;
            case "paypal":
                return paypal;
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido.");
        }
    }
}
