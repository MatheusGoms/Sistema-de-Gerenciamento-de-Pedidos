package com.example.pedidos.service;

import com.example.pedidos.model.Pedido;
import com.example.pedidos.repository.PedidoRepository;
import com.example.pedidos.service.fabrica.PagamentoFactory;
import com.example.pedidos.service.pagamento.PagamentoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Autowired
    private PagamentoFactory pagamentoFactory;

    public void criarPedido(Pedido pedido, String tipoPagamento) {
        repository.adicionarPedido(pedido);
        PagamentoStrategy pagamento = pagamentoFactory.getPagamento(tipoPagamento);
        pagamento.pagar(pedido.getValor());
    }
}
