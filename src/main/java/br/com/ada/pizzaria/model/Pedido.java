package br.com.ada.pizzaria.model;

import java.util.List;

public class Pedido {
    private List<Produto> produto;
    private Cliente cliente;

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
