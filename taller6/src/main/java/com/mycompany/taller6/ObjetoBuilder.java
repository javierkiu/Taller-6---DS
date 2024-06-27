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
public class ObjetoBuilder extends EntidadBuilder{

    public ObjetoBuilder() {
        this.e = new Objeto("", null, 0.0, "");
    }

    @Override
    public boolean definirAcciones() {
        e.acciones = Arrays.asList("usar", "mover", "descartar");
        return true;
    }

    @Override
    public boolean agregarAnimaciones() {
        System.out.println("Agregando animaciones para el objeto...");
        return true;
    }

    @Override
    public boolean configurarEstadisticas() {
        if (e instanceof Objeto) {
            Objeto objeto = (Objeto) e;
            objeto.setPeso(1.5);
            objeto.setTipo("Poción");
        }
        return true;
    }
    
}
