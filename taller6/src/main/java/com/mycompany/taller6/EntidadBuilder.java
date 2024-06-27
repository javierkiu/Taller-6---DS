/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author Justin Roldan
 */
public abstract class EntidadBuilder {
    protected Entidad e;

    public abstract boolean definirAcciones();
    public abstract boolean agregarAnimaciones();
    public abstract boolean configurarEstadisticas();

    public Entidad getEntidad() {
        return e;
    }
}
