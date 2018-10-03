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
public class DAO_UltimoDuenio extends Conexion implements DAO<UltimoDuenio>{

    public DAO_UltimoDuenio() throws ClassNotFoundException, SQLException {
        super("registroAutomovilesUsadosIntentoEnCasa");
    }

    @Override
    public void create(UltimoDuenio ob) throws SQLException {
        ejecutar("INSERT INTO ultimoDuenio VALUES ('"+ob.getRun()+"', '"+ob.getNombreCompleto()+"'"
                + ", '"+ob.getTelefono()+"');");
        
    }

    @Override
    public List<UltimoDuenio> read() throws SQLException {
        List<UltimoDuenio> lista= new ArrayList<UltimoDuenio>();
        
        ResultSet rs=ejecutar("SELECT * FROM ultimoDuenio;");
        
        UltimoDuenio u;
        while(rs.next()){
        u= new UltimoDuenio();
        
        u.setRun(rs.getString(1));
        u.setNombreCompleto(rs.getString(2));
        u.setTelefono(rs.getString(3));
            
            lista.add(u);
        }
        
        return lista;
    }

    @Override
    public void update(UltimoDuenio ob) throws SQLException {
        ejecutar("UPDATE  ultimoDuenio SET nombreCompleto='"+ob.getNombreCompleto()+"'"
                + ", telefono='"+ob.getTelefono()+"' WHERE run='"+ob.getRun()+"' ;");

    }

    @Override
    public void delete(String run) throws SQLException {
        ejecutar("DELETE FROM ultimoDuenio WHERE run= "+run+";");
    }

    @Override
    public List<UltimoDuenio> read(String txt) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UltimoDuenio findByID(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
