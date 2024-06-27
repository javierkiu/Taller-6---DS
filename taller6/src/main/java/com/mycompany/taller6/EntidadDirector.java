/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

/**
 *
 * @author Justin Roldan
 */
public class EntidadDirector {
    private EntidadBuilder builder;
    public EntidadDirector(EntidadBuilder builder){
        this.builder=builder;
    }
    
    public void crearEntidad(){
    }
    
    public Entidad getEntidad(){
        return builder.e;
    }
}
