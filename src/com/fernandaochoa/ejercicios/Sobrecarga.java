package com.fernandaochoa.ejercicios;
/* Sobrecarga.java
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
Ejercicio: 8
Fecha de entrega:
Fecha de entrega real:
 */
public class Sobrecarga {
    void metodo() {
        System.out.println("Metodo sin argumentos");
    }

    void metodo(int x) {
        System.out.println("Un argumento entero: " + x);
    }

    void metodo(float x, float y) {
        System.out.println("x= " + x + "y= " + y);
    }

    void metodo(double x, double y, double z) {
        System.out.printf("%f,%f,%f\n", x, y, z);
    }

    void metodo(String s) {
        System.out.println("La cadena argumento es: " + s);
    }

    public static void main(String[] args) {
        Sobrecarga s = new Sobrecarga();
        s.metodo();
        s.metodo(10);
        s.metodo(-3.14f, 12);
        s.metodo(3.14, 2.718, 9.81);
        s.metodo("Saboreando la rica miel");
    }
}
