package com.fernandaochoa.ejercicios;

/* Airpleane.java
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
Ejercicio: 27
Fecha de entrega:
Fecha de entrega real:
 */
public class Airplane implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("Accelerate until lift-off");
        System.out.println("Raise landing gear");
    }

    @Override
    public void land() {
        System.out.println("Lower landing gear");
        System.out.println("Decelerate and lower flaps until touch-down");
        System.out.println("Apply breaks until stop");
    }

    @Override
    public void fly() {
        System.out.println("Keep those engines running");
    }

    public static void main(String[] args) {

        Airplane a = new Airplane();
        a.fly();
        a.land();
        a.takeOff();
    }
}
