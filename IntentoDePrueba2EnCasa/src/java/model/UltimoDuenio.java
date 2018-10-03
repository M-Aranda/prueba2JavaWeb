/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marce
 */
public class UltimoDuenio {
    
    private String run;
    private String nombreCompleto;
    private String telefono;

    public UltimoDuenio() {
    }

    public UltimoDuenio(String run, String nombreCompleto, String telefono) {
        this.run = run;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
    }

    public String getRun() {
        return run;
    }

    public UltimoDuenio setRun(String run) {
        this.run = run;
        return this;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public UltimoDuenio setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public UltimoDuenio setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }
    
    
    
    
    
}
