/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
public class Enemigo extends Entidad {
    private String tipo;
    private int poder;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public void dibujar() {
    }

    @Override
    public void actualizar() {
    }
}
