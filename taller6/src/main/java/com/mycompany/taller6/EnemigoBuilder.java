package com.mycompany.taller6;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Justin Roldan
 */
public class EnemigoBuilder extends EntidadBuilder{
    public EnemigoBuilder() {
        this.e = new Enemigo("", null, "", 0);
    }

    @Override
    public boolean definirAcciones() {
        e.acciones = Arrays.asList("patrullar", "atacar", "huir");
        return true;
    }

    @Override
    public boolean agregarAnimaciones() {
        System.out.println("Agregando animaciones para el enemigo...");
        return true;
    }

    @Override
    public boolean configurarEstadisticas() {
        if (e instanceof Enemigo) {
            Enemigo enemigo = (Enemigo) e;
            enemigo.setTipo("ORCO");
            enemigo.setPoder(75);
        }
        return true;
    }
}
