package com.fernandaochoa.ejercicios.Ejercicio23;

/* Detergent.java
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
Ejercicio: 23
Fecha de entrega:
Fecha de entrega real:
 */
public class Detergent extends Cleanser {
    //change a method
    public void scrub() {    //metodo redefinido
        append(" Detergent.scrub()");
        super.scrub();  //call base-class version
        foam();
    }

    //Add methods to the interface:
    public void foam() {
        append(" foam()");
    }

    //test the new class:
    public static void main(String[] args) {
        Detergent acce = new Detergent();

        acce.dilute();
        acce.apply();
        acce.scrub();
        acce.foam();
        acce.print();
        System.out.println("Testing base class");
        Cleanser.main(args);
        acce.toString();
    }
}//Ejercicio 23