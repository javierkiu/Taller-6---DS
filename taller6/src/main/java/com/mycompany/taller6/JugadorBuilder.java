/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

import java.util.Arrays;

/**
 *
 * @author Justin Roldan
 */
public class JugadorBuilder extends EntidadBuilder{
    public JugadorBuilder() {
        this.e = new Jugador("", null, 0, 0);
    }

    @Override
    public boolean definirAcciones() {
        e.acciones = Arrays.asList("correr", "saltar", "atacar");
        return true;
    }

    @Override
    public boolean agregarAnimaciones() {
        System.out.println("Agregando animaciones para el jugador...");
        return true;
    }

    @Override
    public boolean configurarEstadisticas() {
        if (e instanceof Jugador) {
            Jugador jugador = (Jugador) e;
            jugador.setVida(100);
            jugador.setFuerza(50);
        }
        return true;
    }
}
