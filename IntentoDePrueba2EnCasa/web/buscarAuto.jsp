<%-- 
    Document   : buscarAuto
    Created on : Oct 2, 2018, 9:09:55 PM
    Author     : Marce
--%>

<%@page import="model.Automovil"%>
<%@page import="java.util.List"%>
<%@page import="model.DAO_Automovil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busqueda de auto</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body>
        
        
        <h1>Busque autos por patente</h1>
        
        <form action="buscarAuto.do" method="post">
            <input type="text" name="patenteABuscar" required>
            <input type="submit" value="Buscar">
            
        </form>
        <br>
        
        <% DAO_Automovil da= new DAO_Automovil(); 
        
        if(request.getSession().getAttribute("resBusqueda")!=null){
            List<Automovil> lista= (List<Automovil>)request.getSession().getAttribute("resBusqueda");
        
        
        %>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Patente</th>
                    <th>Marca</th>
                    <th>Anio</th>
                    <th>Detalles</th>
                    <th>Ultimo Duenio</th>
                </tr>
            </thead>
            <tbody>
                
                <%for(Automovil a: lista){ %>
                
                <tr>
                    <td><%= a.getId()%></td>
                    <td><%= a.getPatente()%></td>
                    <td><%= a.getMarca()%></td>
                    <td><%= a.getAnio()%></td>
                    <td><%= a.getDetalles()%></td>
                    <td><%= a.getUd().getNombreCompleto()%></td>
                  
                </tr>
                <%}
}
                %>
                
        <% 
            
        if(request.getSession().getAttribute("lista")!=null){
            request.getSession().removeAttribute("lista");//esto no funciona asi que... siguiente linea
            da.read("");//mentira tampoco funciona
            /*
            Como le hago para quitar un atributo de una sesion para que la tabla no se quede con lo mismo?
            */
        }
        
     

        
        %>
            </tbody>
        </table>

        
        
        
        
        <a href="index.jsp">Volver</a>
    </body>
</html>
