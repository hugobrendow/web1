package br.com.ada.pizzaria.servlets;

import br.com.ada.pizzaria.model.Cliente;
import br.com.ada.pizzaria.model.Pedido;
import br.com.ada.pizzaria.service.PedidoService;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

@WebServlet(value = "/pedido")
public class PedidoServlet extends HttpServlet {

    @Inject
    private PedidoService pedidoService;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();
        // GET
        // PARAMETROS DA REQUEST
        cliente.setCpf(request.getParameter("cpf"));
        cliente.setEndereco(request.getParameter("endereco"));
        cliente.setTelefone(request.getParameter("telefone"));
        cliente.setNome(request.getParameter("nome"));

        pedido.setCliente(cliente);
        pedido.setProduto(Collections.emptyList());

        this.pedidoService.realizarPedido(pedido);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h4>pedido criado com sucesso!</h4>");

        out.println("<h1> Pedidos realizados: </h1>");

        List<Pedido> pedidos = pedidoService.getPedidos();
        out.println("<ul>");
            pedidos.forEach(pedidoRealizado -> {
                out.println("<li>");
                out.println("<h3> Cliente: " + pedidoRealizado.getCliente().getNome() + "</h3>");
                out.println("</li>");
            });
        out.println("</ul>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}