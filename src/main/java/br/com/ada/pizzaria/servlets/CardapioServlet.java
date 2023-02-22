package br.com.ada.pizzaria.servlets;

import br.com.ada.pizzaria.model.Produto;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CardapioWeb", value = "/cardapio")
public class CardapioServlet extends HttpServlet {

    private List<Produto> produtos;

    public void init() {
        Produto pizzaCalabresa = new Produto("Pizza calabresa", "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=250&q=50", "R$ 45,99");
        Produto pizzaPortuguesa = new Produto("Pizza portuguesa", "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=250&q=50", "R$ 51,99");
        produtos = List.of(pizzaCalabresa, pizzaPortuguesa);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Pizzaria do Seu José</h1>");
        out.println("<ul>");
        produtos.forEach(produto -> {
            out.println("<li>");
                out.println("<h3>" + produto.getNome() + "</h3>");
                out.println("<h5>" + produto.getPreco() + "</h5>");
                out.println("<img src=" + produto.getUrlImagem() + "/>");
            out.println("</li>");
        });
        out.println("</ul>");
        out.println("</body></html>");
    }
}
