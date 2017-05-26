package com.fernandaochoa.ejercicios.ejercicio10;

/* BookDemo.java
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
Ejercicio: 1
Fecha de entrega:
Fecha de entrega real:
 */
public class Mamifero {

    private int numeroDePatas;
    private String colorDePelo;
    private String nombre;

    public void imprimirPatas() {

        System.out.println("El numero de patas que tiene el mamifero son: " + numeroDePatas);
    }

    public void imprimirNombre() {
        System.out.println("El nombre del mamifero es: " + nombre);
    }

    public void imprimirColor() {
        System.out.println("El color de pelo que tiene el mamifero es: " + colorDePelo);
    }

    public Mamifero(String nombre, String color, int patas) {
        this.nombre = nombre;
    }
}
