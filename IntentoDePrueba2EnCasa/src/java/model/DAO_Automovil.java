/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marce
 */
public class DAO_Automovil extends Conexion implements DAO <Automovil> {

    public DAO_Automovil() throws ClassNotFoundException, SQLException {
        super("registroAutomovilesUsadosIntentoEnCasa");
    }

    @Override
    public void create(Automovil ob) throws SQLException {
        ejecutar("INSERT INTO automovil VALUES (NULL, '"+ob.getPatente()+"'"
                + ", '"+ob.getMarca()+"', "+ob.getAnio()+", '"+ob.getDetalles()+"',"
                        + " '"+ob.getUd().getRun()+"');  ");
    }

    @Override
    public List<Automovil> read() throws SQLException {
        List<Automovil> lista= new ArrayList<Automovil>();
        
        ResultSet rs=ejecutar("SELECT * FROM automovil;");
        
        Automovil a;
        while(rs.next()){
            a=new Automovil();
            
            a.setId(rs.getInt(1));
            a.setPatente(rs.getString(2));
            a.setMarca(rs.getString(3));
            a.setAnio(rs.getInt(4));
            a.setDetalles(rs.getString(5));
            
            String runUltimoDuenio=rs.getString(6);
            ResultSet buscaDuenios=ejecutar("SELECT * FROM ultimoDuenio WHERE"
                    + "run= '"+runUltimoDuenio+"'; ");
            
            UltimoDuenio ultimo= new UltimoDuenio();;
            if(buscaDuenios.next()){
                ultimo.setRun(buscaDuenios.getString(1));
                ultimo.setNombreCompleto(buscaDuenios.getString(2));
                ultimo.setTelefono(buscaDuenios.getString(3));               
            }
            
            a.setUd(ultimo);
            
            
            
            lista.add(a);
        }
        
        return lista;
    }

    @Override
    public void update(Automovil ob) throws SQLException {
        ejecutar("UPDATE automovil SET patente='"+ob.getPatente()+"', marca='"+ob.getMarca()+"',"
                + ""+ob.getAnio()+", '"+ob.getDetalles()+"', '"+ob.getUd().getRun()+"' WHERE id="+ob.getId()+"; ");
    }

    @Override
    public void delete(String id) throws SQLException {
        ejecutar("DELETE FROM automovil WHERE id='"+id+"'; ");
    }

    @Override
    public List<Automovil> read(String txt) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Automovil findByID(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void borrarAutomovil(int id) throws SQLException {
        ejecutar("DELETE FROM automovil WHERE id="+id+"; ");
    }
    
}
