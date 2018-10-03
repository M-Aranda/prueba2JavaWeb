package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Automovil;
import model.DAO_Automovil;

/**
 *
 * @author Marce
 */
@WebServlet(urlPatterns = {"/buscarAuto.do"})
public class BuscarAutoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setCharacterEncoding("UTF-8");

            DAO_Automovil da = new DAO_Automovil();
            String patente = request.getParameter("patenteABuscar");
            List<Automovil> lista = da.read(patente);
            
            
            if (lista.isEmpty()) {
                response.sendRedirect("error.jsp");
                
            }else{
                request.getSession().setAttribute("resBusqueda", lista);
                response.sendRedirect("buscarAuto.jsp");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscarAutoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarAutoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
