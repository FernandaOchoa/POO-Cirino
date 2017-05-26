package com.fernandaochoa.ejercicios;

import java.util.Scanner;

/* Ejercicio33.java
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
Ejercicio: 33
Fecha de entrega:
Fecha de entrega real:
 */
public class Ejercicio33 {

    BoxG<String> b = new BoxG <String> ();
    Scanner t = new Scanner(System.in);

    void inicio () {
        System.out.println("Para manipular una caja generica");
    }
    public void guardaObjeto(){
        System.out.println("Deme el nombre del objeto");
        b.add(t.nextLine());
    }
    //No hay calculos
    void revisaCaja(){
        System.out.println("La caja contiene: "+b.getT());
    }

    public static void main(String[] args) {
        Ejercicio33 tb = new Ejercicio33();
        tb.inicio();
        tb.guardaObjeto();
        tb.revisaCaja();
    }
}
