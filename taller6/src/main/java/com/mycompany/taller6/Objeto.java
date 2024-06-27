/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class Objeto extends Entidad {
    private double peso;
    private String tipo;

    public Objeto(String nombre, List<String> acciones, double peso, String tipo) {
        this.nombre = nombre;
        this.acciones = acciones;
        this.peso = peso;
        this.tipo = tipo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando objeto: " + nombre);
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando estado del objeto: " + nombre);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
