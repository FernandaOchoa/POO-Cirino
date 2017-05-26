package com.fernandaochoa.tareas.Tarea5;

import cstio.Pizarra;
/*Syndrome.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Programación Orientada a Objetos.
  Martes - Jueves 7:00/8:40 Viernes 7:50/8:40
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: ____5___
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class Syndrome implements PoderesSyndrome {

    @Override
    public void volar(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("Volar");
        p.out("");
        p.ofoto("volar.jpg");
    }

    @Override
    public void disparar(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("Disparar");
        p.out("");
        p.ofoto("disparar.jpg");
    }

    @Override
    public void superFuerza(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("Super Fuerza");
        p.out("");
        p.ofoto("fuerza2.jpg");
    }

    @Override
    public void muere(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("FIN");
        p.out("");
        p.ofoto("muerto.png");
    }

    @Override
    public void llamarRobots(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("Ataquen!");
        p.out("");
        p.ofoto("syndromerobot.jpg");
    }
}
