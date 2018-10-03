package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Automovil;
import model.DAO_Automovil;
import model.DAO_UltimoDuenio;
import model.UltimoDuenio;

/**
 *
 * @author Marce
 */
@WebServlet(name="RegistrarAutoServlet", urlPatterns={"/registrar.do"})
public class RegistrarAutoServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            response.setCharacterEncoding("UTF-8");
            
            DAO_UltimoDuenio dud=new DAO_UltimoDuenio();
            UltimoDuenio elUltimo= new UltimoDuenio();
            elUltimo.setRun(request.getParameter("run"));
            elUltimo.setNombreCompleto(request.getParameter("nombre"));
            elUltimo.setTelefono(request.getParameter("telefono"));
            
            UltimoDuenio posibleDuenioExistente=dud.findByID(elUltimo.getRun());
            if(posibleDuenioExistente==null){//si no existe se crea
                dud.create(elUltimo);
            }else {
                dud.update(elUltimo);// si existe se actualiza
            }
            
            
            
            
            
            new DAO_Automovil().create( new Automovil()
                    .setPatente(request.getParameter("patente"))
                    .setMarca(request.getParameter("marca"))
                    .setAnio(Integer.parseInt(request.getParameter("anio")))
                    .setDetalles(request.getParameter("detalles"))
                    .setUd(elUltimo)       
            );
            
            response.sendRedirect("registroExitoso.jsp");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarAutoServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarAutoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
