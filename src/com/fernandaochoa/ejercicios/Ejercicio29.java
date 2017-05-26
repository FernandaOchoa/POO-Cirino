package com.fernandaochoa.ejercicios;

import cstio.Dialog;
import cstio.Pizarra;

/* Ejercicio29.java
Instituto Tecnológico de León
Ingeniería en Sistemas Computacionales
Programación Orientada a Objetos
Horario: Mar y Jue 7:00 - 8:45
         Vie 7:50 - 8:40
Nombre de la alumna: Guzmán Hernández, Francisco
                     Ibarra Muñoz, Arantxa Patricia
                     Ramírez Ochoa, Fernanda Monserrat
                     Rodríguez Borja, Flor Paulina

Foto digital de la alumna:
Ejercicio: 29
Fecha de entrega:
Fecha de entrega real:
 */
public class Ejercicio29 {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    Superman superman = new Superman();

    String aux;
    int opcion;

    public void meta() {
        p.out("Ejercicio de interfaces con Superman");
    }

    public void datos() {

    }

    public void calculos() {

    }

    public void resultados() {
        switch (opcion) {
            case 1:
                superman.takeOff();
                break;
            case 2:
                superman.land();
                break;
            case 3:
                superman.fly();
                break;
            case 4:
                superman.leapBuildings();
                break;
            case 5:
                superman.stopBullets();
                break;
            case 6:
                System.exit(0);
                break;
        }
    }

    public boolean isNum(String cant) {
        try {
            Integer.parseInt(cant);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("No has ingresado un valor");
            return false;
        }
    }

    public void navegabilidad() {
        do {

            aux = d.readString("Menu de opciones \n " +
                    "Selecciona una opcion a mostrar \n" +
                    "1) takeOff \n" +
                    "2) land \n" +
                    "3) fly \n" +
                    "4) leapBuildings \n" +
                    "5) stopBullet \n" +
                    "6) salir ");
            while (!isNum(aux)) ;

            opcion = (Integer.parseInt(aux));
            if (opcion != 6) {
                resultados();
            }
        }
        while (opcion != 6);
    }

    public static void main(String[] args) {
        Ejercicio29 obj = new Ejercicio29();
            obj.meta();
            obj.navegabilidad();
    }
}
