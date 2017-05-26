package com.fernandaochoa.ejercicios;

import cstio.Pizarra;

/* Superman.java
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
Ejercicio: 29
Fecha de entrega:
Fecha de entrega real:
 */
public class Superman implements Flyer{
    Pizarra p = new Pizarra();

    public void takeOff(){
        p.setVisible(true);
        p.ofoto("takeoff.jpg");
        System.out.println("Take off");
    }
    public void land(){
        p.setVisible(true);
        p.ofoto("land.jgp");
        System.out.println("land");
    }
    public void fly(){
        p.ofoto("fly.jpg");
        System.out.println("fly");
    }
    public void leapBuildings(){
        p.ofoto("leap.jpg");
        System.out.println("leap buildings");
    }
    public void stopBullets(){
        p.ofoto("bullet.jpg");
        System.out.println("stop bullets");
    }
}
