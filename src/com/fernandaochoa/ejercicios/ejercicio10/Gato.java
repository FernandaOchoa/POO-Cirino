package com.fernandaochoa.ejercicios.ejercicio10;

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
Ejercicio: 10
Fecha de entrega:
Fecha de entrega real:
 */
public class Gato extends Mamifero {
    private int araña;
    private int ratonesCazados;

    public Gato(String nombre, String color, int patas) {
        super(nombre, color, patas);
    }

    public boolean setAraña(int a){
        if (a > 0){
            araña = a;
            return true;
        } else return false;
    }

    public boolean setRatonesCazados(int rc){
        if (rc > 0){
            ratonesCazados = rc;
            return true;
        } else return false;
    }

    public int getAraña(){  return araña; }
    public int getRatonesCazados() { return ratonesCazados; }
}
