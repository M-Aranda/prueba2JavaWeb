<%-- 
    Document   : catalogo
    Created on : Oct 2, 2018, 9:10:10 PM
    Author     : Marce
--%>


<%@page import="model.Automovil"%>
<%@page import="model.DAO_Automovil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalogo de autos</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body>
        
        <h1>Catalogo de autos</h1>
        
        <%DAO_Automovil da= new DAO_Automovil();%>
        
        <table border="2">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Patente</th>
                    <th>Marca</th>
                    <th>Anio</th>
                    <th>Detalles</th>
                    <th>Ultimo duenio</th>
                </tr>
            </thead>
            <tbody>
                <%
                
                
                for (Automovil a : da.read()) {
                        
                    
                %>
                <tr>
                    <td><%= a.getId()%></td>
                    <td><%= a.getPatente()%></td>
                    <td><%= a.getMarca()%></td>
                    <td><%= a.getAnio()%></td>
                    <td><%= a.getDetalles()%></td>
                    <td><%= a.getUd().getNombreCompleto()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>

        
        
        
        
        <br>
        <a href="index.jsp">Volver</a>
    </body>
</html>
