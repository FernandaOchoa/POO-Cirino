package com.fernandaochoa.ejercicios.Ejercicio12;
/* Mamifero.java
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

public class Mamifero {

    private int numeroDePatas;
    private String colorDePelo;
    private String nombre;

    public boolean setNombre(String nombre) {
        if (nombre.length() != 0) {
            this.nombre = nombre;
            return true;
        } else return false;
    }

    public boolean setColorDePelo(String color) {
        if (color.length() != 0) {
            colorDePelo = color;
            return true;
        } else return false;
    }

    public boolean setNumeroDePatas(int npatas) {
        if (npatas != 0) {
            numeroDePatas = npatas;
            return true;
        } else return false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    void imprimirPatas() {
        System.out.println("El número de patas es: " + numeroDePatas);
    }

    void imprimirNombre() {
        System.out.println("El nombre del mamífero es: " + nombre);
    }

    void imprimirColor() {
        System.out.println("El color del mamífero es: " + colorDePelo);
    }

    public Mamifero() {
    }

    public Mamifero(String nombre, String color, int npatas) {
        nombre = this.nombre;
        color = colorDePelo;
        npatas = numeroDePatas;
    }

}//class
//Ejercicio 1
