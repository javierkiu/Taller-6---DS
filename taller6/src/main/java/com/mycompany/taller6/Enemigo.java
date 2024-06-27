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
public class Enemigo extends Entidad {
    private String tipo;
    private int poder;

    public Enemigo(String nombre, List<String> acciones, String tipo, int poder) {
        this.nombre = nombre;
        this.acciones = acciones;
        this.tipo = tipo;
        this.poder = poder;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando enemigo: " + nombre);
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando estado del enemigo: " + nombre);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    
}
