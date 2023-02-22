package br.com.ada.pizzaria.servlets;

import br.com.ada.pizzaria.service.TraducaoService;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "traducaoServlet", value = "/traducao")
public class TraducaoServlet extends HttpServlet {

    TraducaoService traducaoService;

    public void init() {
        this.traducaoService = new TraducaoService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + traducaoService.getMensagem(request.getParameter("linguagem")) + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}