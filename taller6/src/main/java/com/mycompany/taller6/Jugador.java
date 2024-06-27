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
public class Jugador extends Entidad{
    private int vida;
    private int fuerza;

    public Jugador(String nombre, List<String> acciones, int vida, int fuerza) {
        this.nombre = nombre;
        this.acciones = acciones;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando jugador: " + nombre);
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando estado del jugador: " + nombre);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<String> acciones) {
        this.acciones = acciones;
    }
    
}
