/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author Justin Roldan
 */
public class Configuracion {
    private static Configuracion instancia;
    private int dimensiones;
    private int minMemoriaRam;
    private int minEspacioDisco;

    private Configuracion() {
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getMinMemoriaRam() {
        return minMemoriaRam;
    }

    public void setMinMemoriaRam(int minMemoriaRam) {
        this.minMemoriaRam = minMemoriaRam;
    }

    public int getMinEspacioDisco() {
        return minEspacioDisco;
    }

    public void setMinEspacioDisco(int minEspacioDisco) {
        this.minEspacioDisco = minEspacioDisco;
    }
    
}
