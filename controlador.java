package com.example.pedidos.controller;

import com.example.pedidos.model.Pedido;
import com.example.pedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public String criarPedido(@RequestParam String id,
                               @RequestParam String descricao,
                               @RequestParam double valor,
                               @RequestParam String tipoPagamento) {
        Pedido pedido = new Pedido(id, descricao, valor);
        pedidoService.criarPedido(pedido, tipoPagamento);
        return "Pedido criado com sucesso!";
    }
}
