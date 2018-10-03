<%-- 
    Document   : registrarAuto
    Created on : Oct 2, 2018, 9:09:40 PM
    Author     : Marce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar autos</title>
        
        <link rel="stylesheet" href="style.css" type="text/css">
        
        
        
    </head>
    <body>
        
        <form action="registrar.do" method="post">
            
            <h1>Informacion del auto</h1>
            <input type="text" name="patente" placeholder="Patente: " required >
            <br>
            <input type="text" name="marca" placeholder="Marca " required >
            <br>
            <input type="text" name="anio" placeholder="Anio " required >
            <br>
            <input type="text" name="detalles" placeholder="Detalles " required >
            <br>
            <br>
            <br>
            
            <h1>Informacion del ultimo duenio</h1>
            <input type="text" name="run" placeholder="Run " required >
            <input type="text" name="nombre" placeholder="Nombre " required >
            <input type="text" name="telefono" placeholder="Telefono " required >
            <br>
            <br>
            <input type="submit" value="Registrar">
            
            
        </form>
        
        
        
        <br>
        <a href="index.jsp">Volver</a>
    </body>
</html>
