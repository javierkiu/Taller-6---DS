/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author CltControl
 */
public class Jugador extends Entidad{
    private int vida;
    private int fuerza;
    
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void dibujar() {
    }

    @Override
    public void actualizar() {
    }  
}
