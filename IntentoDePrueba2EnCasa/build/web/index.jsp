

<%@page import="model.DAO_Automovil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Indice</title>
        
        <link rel="stylesheet" href="style.css" type="text/css">
        
    </head>
    <body>
        <h1>Bienvenido al menu principal</h1>
        
        <a href="registrarAuto.jsp">Registrar automóvil</a>
        <br>
        <a href="buscarAuto.jsp">Buscar automóvil</a>
        <br>
        <a href="catalogo.jsp">Catalogo</a>
        <br>
        
        <% DAO_Automovil da= new DAO_Automovil();%>

        <h3>La cantidad de automoviles registrados es de: <%= da.getCantAutos()%> </h3>
        
    </body>
</html>
