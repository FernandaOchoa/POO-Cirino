package com.fernandaochoa.ejercicios;

/* Point.java
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
Ejercicio: 7
Fecha de entrega:
Fecha de entrega real:
 */

public class Point {

    private int x, y;
    public Point() {

    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public static void main(String[] args) {
        Point p = new Point(3.2, -4.5);

        System.out.println("El valor para x es: " + p.x +
                "\nEl valor para y es: " + p.y);
    }
}
