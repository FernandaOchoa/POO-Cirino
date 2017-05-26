package com.fernandaochoa.ejercicios.ejercicio10;

/* Perro.java
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
Ejercicio: 10
Fecha de entrega:
Fecha de entrega real:
 */
public class Perro extends Mamifero {
    private int mordidas;
    private int trucos;

    public Perro(String nombre, String color, int patas, int mordidas, int trucos) {
        super(nombre, color, patas);
        this.mordidas = mordidas;
        this.trucos = trucos;
    }

    public Perro(String nombre, String color, int patas) {
        super(nombre, color, patas);
    }

    public boolean setMordidas(int m) {
        if (m > 0) {
            mordidas = m;
            return true;
        } else return false;
    }

    public boolean setTrucos(int t) {
        if (t > 0) {
            trucos = t;
            return true;
        } else return false;
    }

    public int getMordidas() {
        return mordidas;
    }

    public int getTrucos() {
        return trucos;
    }
}
