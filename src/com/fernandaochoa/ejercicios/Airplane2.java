package com.fernandaochoa.ejercicios;

import cstio.Pizarra;

/* Airplane2.java
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
Ejercicio: 28
Fecha de entrega:
Fecha de entrega real:
 */
public class Airplane2  implements Flyer{
    Pizarra pi = new Pizarra();


    @Override
    public void takeOff() {
        pi.setVisible(true);
        pi.out("\n");
      pi.ofoto("avion.jpg");


    }

    @Override
    public void land() {
        pi.ofoto("vuelo.jpg");
        pi.out("\n");
    }

    @Override
    public void fly() {
        pi.ofoto("azafata.jpg");
        pi.out("\n");

    }

    public static void main(String[] args) {

        Airplane2 a = new Airplane2();
        a.fly();
        a.land();
        a.takeOff();
    }
}
