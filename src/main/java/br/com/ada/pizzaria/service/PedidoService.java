package br.com.ada.pizzaria.service;

import br.com.ada.pizzaria.model.Pedido;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();

    public String realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
        return "Pedido realizado com sucesso";
    }

    public List<Pedido> getPedidos() {
        return this.pedidos;
    }
}
