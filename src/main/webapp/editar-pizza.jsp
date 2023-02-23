<%--
  Created by IntelliJ IDEA.
  User: Hugo Brendow
  Date: 23/02/2023
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Editar Pizza</title>
</head>
<body>
<h1>Editar Pizza</h1>
<form method="POST" action="editar-pizza">
    <input type="hidden" name="nomeAntigo" value="${pizza.nome}">
    <label for="nome">Nome:</label>
    <input type="text" name="nome" value="${pizza.nome}" required>
    <br>
    <label for="ingredientes">Ingredientes:</label>
    <input type="text" name="ingredientes" value="${pizza.ingredientes}" required>
    <br>
    <label for="preco">Preço:</label>
    <input type="number" name="preco" step="0.01" min="0" value="${pizza.preco}" required>
    <br>
    <button type="submit">Salvar</button>
</form>
</body>
</html>