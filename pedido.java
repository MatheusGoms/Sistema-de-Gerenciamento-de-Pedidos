package com.example.pedidos.model;

public class Pedido {
    private String id;
    private String descricao;
    private double valor;

    public Pedido(String id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
