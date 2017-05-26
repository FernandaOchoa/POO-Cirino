package com.fernandaochoa.ejercicios.Ejercicio12;

/* Gato.java
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
Ejercicio: 12
Fecha de entrega:
Fecha de entrega real:
 */
public class Gato extends Mamifero {
    private int arañados;
    private int ratonesCazados;

    public boolean setArañados(int arañados) {
        if (arañados > 0) {
            this.arañados = arañados;
            return true;
        } else {
            return false;
        }
    }

    public boolean setRatonesCazados(int ratonesCazados) {
        if (ratonesCazados > 0) {
            this.ratonesCazados = ratonesCazados;
            return true;
        } else {
            return false;
        }
    }

    public int getArañados() {
        return arañados;
    }

    public int getRatonesCazados() {
        return ratonesCazados;
    }

    public Gato() {
    }

    public Gato(String nombre, String color, int npatas, int arañados,
                int ratonesCazados) {
        super(nombre, color, npatas);
        this.arañados = arañados;
        this.ratonesCazados = ratonesCazados;
    }
}//public class
//Ejercicio 10
