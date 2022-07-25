<%--
  Created by IntelliJ IDEA.
  User: Isa
  Date: 22/07/22
  Time: 00:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Cliente</title>
</head>
<body>

    <h1>Cadastro de cliente</h1>

    <fieldset>
        <legend>Dados básicos</legend>
        <br>
        <form action="cliente-servlet" method="post">
            <div>
                <label for="idNome">Nome:</label>
                <input type="text" id="idNome" name="nome">
            </div>
            <br>
            <div>
                <label for="idCpf">CPF:</label>
                <input type="text" id="idCpf" name="cpf">
            </div>
            <br>
            <div>
                <label for="idEmail">Email:</label>
                <input type="text" id="idEmail" name="email"><br>
            </div>
            <br>
            <div>
                <label for="idIdade">Idade:</label>
                <input type="text" id="idIdade" name="idade">
            </div>
            <br>
            <div>
            <input type="submit" value="Enviar">
            </div>

        </form>
    </fieldset>



</body>
</html>
