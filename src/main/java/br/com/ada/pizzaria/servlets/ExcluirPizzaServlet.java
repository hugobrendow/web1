package br.com.ada.pizzaria.servlets;

import br.com.ada.pizzaria.dao.CardapioDAO;
import br.com.ada.pizzaria.model.Pizza;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/excluir-pizza")
public class ExcluirPizzaServlet extends HttpServlet {
    @Inject
    private CardapioDAO cardapioDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        Pizza pizza = cardapioDAO.getPizza(nome);
        request.setAttribute("pizza", pizza);
        request.getRequestDispatcher("excluir-pizza.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        cardapioDAO.excluirPizza(nome);
        response.sendRedirect(request.getContextPath() + "/cardapio");
    }
}