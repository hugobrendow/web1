<%@ page import="br.com.ada.pizzaria.model.Pizza" %><%--
  Created by IntelliJ IDEA.
  User: Hugo Brendow
  Date: 23/02/2023
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Cardápio de Pizzas</title>
</head>
<body>
<h1>Cardápio de Pizzas</h1>
<table>
    <tr>
        <th>Nome</th>
        <th>Ingredientes</th>
        <th>Preço</th>
        <th>Ações</th>
    </tr>

    <c:forEach items="${cardapio}" var="pizza">
        <tr>
            <td>${pizza.nome}</td>
            <td>${pizza.ingredientes}</td>
            <td>R$ ${pizza.preco}</td>
            <td>
                <a href="editar-pizza?nome=${pizza.nome}">Editar</a>
                <a href="excluir-pizza?nome=${pizza.nome}">Excluir</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="nova-pizza.jsp">Adicionar Pizza</a>
</body>
</html>