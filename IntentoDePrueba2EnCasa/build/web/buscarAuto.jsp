

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
        
        <style>
            
        </style>
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
            //el atributo se llama resBusqueda, no lista
        
        %>
        
        <table border="1"  class="tablaDeResultados">
            
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Patente</th>
                    <th>Marca</th>
                    <th>Anio</th>
                    <th>Detalles</th>
                    <th>Run del ultimo duenio</th>
                    <th>Nombre Completo del ultimo duenio</th>
                    <th>Telefono del ultimo duenio</th>
                    
                </tr>
            </thead>
            <tbody>
                
                <%for(Automovil a: lista){ %>
            </span
                <tr>
                    <td><%= a.getId()%></td>
                    <td><%= a.getPatente()%></td>
                    <td><%= a.getMarca()%></td>
                    <td><%= a.getAnio()%></td>
                    <td class="resalto"><%= a.getDetalles()%></td>
                    <td><%= a.getUd().getRun()%></td>
                    <td class="resalto"><%= a.getUd().getNombreCompleto()%></td>
                    <td class="resalto"><%= a.getUd().getTelefono()%></td>
                  
                </tr>
                <%}
}
                %>
                
        <% 
            
        if(request.getSession().getAttribute("resBusqueda")!=null){
            request.getSession().removeAttribute("resBusqueda");//quita el atributo
            //da.read("");
           
        }
        
     

        
        %>
            </tbody>
        </table>

        
        
        
        
        <a href="index.jsp">Volver</a>
    </body>
</html>
