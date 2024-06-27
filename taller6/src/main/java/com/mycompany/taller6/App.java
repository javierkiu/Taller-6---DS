/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller6;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class App {
    public static void main(String[] args) {
        // Crear un jugador
        EntidadBuilder jugadorBuilder = new JugadorBuilder();
        EntidadDirector director = new EntidadDirector(jugadorBuilder);
        director.crearEntidad();
        Entidad jugador = director.getEntidad();
        jugador.nombre = "Héroe";
        jugador.acciones = new ArrayList<>();
        jugador.dibujar();
        jugador.actualizar();

        // Crear un enemigo
        EntidadBuilder enemigoBuilder = new EnemigoBuilder();
        director = new EntidadDirector(enemigoBuilder);
        director.crearEntidad();
        Entidad enemigo = director.getEntidad();
        enemigo.nombre = "Goblin";
        enemigo.acciones = new ArrayList<>();
        enemigo.dibujar();
        enemigo.actualizar();

        // Crear un objeto
        EntidadBuilder objetoBuilder = new ObjetoBuilder();
        director = new EntidadDirector(objetoBuilder);
        director.crearEntidad();
        Entidad objeto = director.getEntidad();
        objeto.nombre = "Poción de Vida";
        objeto.acciones = new ArrayList<>();
        objeto.dibujar();
        objeto.actualizar();
        
        // Obtener la instancia única de Configuracion
        Configuracion config = Configuracion.getInstancia();

        // Configurar algunas propiedades (si es necesario)
        config.setDimensiones(1024);
        config.setMinMemoriaRam(2048);
        config.setMinEspacioDisco(50000);

        // Imprimir las propiedades para verificar
        System.out.println("Dimensiones: " + config.getDimensiones());
        System.out.println("Memoria RAM mínima: " + config.getMinMemoriaRam());
        System.out.println("Espacio en disco mínimo: " + config.getMinEspacioDisco());

        // Obtener otra referencia a la instancia para verificar que es la misma
        Configuracion otraConfig = Configuracion.getInstancia();
        System.out.println("¿Es la misma instancia? " + (config == otraConfig));
    }
}
