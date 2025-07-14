package com.example.pedidos.repository;

import com.example.pedidos.model.Pedido;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PedidoRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return new ArrayList<>(pedidos);
    }
}
