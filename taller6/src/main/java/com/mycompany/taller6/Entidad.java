/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.taller6;

import java.util.List;

/**
 *
 * @author CltControl
 */
public abstract class Entidad {
    protected String nombre;
    protected List<String> acciones;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAcciones(List<String> acciones) {
        this.acciones = acciones;
    }

    public abstract void dibujar();
    public abstract void actualizar();
}
