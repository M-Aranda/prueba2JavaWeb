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
public class Automovil {
    
    private int id;
    private String patente;
    private String marca;
    private int anio;
    private String detalles;
    private UltimoDuenio ud;

    public Automovil() {
    }

    public Automovil(int id, String patente, String marca, int anio, String detalles, UltimoDuenio ud) {
        this.id = id;
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.detalles = detalles;
        this.ud = ud;
    }

    public int getId() {
        return id;
    }

    public Automovil setId(int id) {
        this.id = id;
        return this;
    }

    public String getPatente() {
        return patente;
    }

    public Automovil setPatente(String patente) {
        this.patente = patente;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Automovil setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public int getAnio() {
        return anio;
    }

    public Automovil setAnio(int anio) {
        this.anio = anio;
        return this;
    }

    public String getDetalles() {
        return detalles;
    }

    public Automovil setDetalles(String detalles) {
        this.detalles = detalles;
        return this;
    }

    public UltimoDuenio getUd() {
        return ud;
    }

    public Automovil setUd(UltimoDuenio ud) {
        this.ud = ud;
        return this;
    }
    
    
    
    
}
