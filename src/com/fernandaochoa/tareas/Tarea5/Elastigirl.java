package com.fernandaochoa.tareas.Tarea5;

import cstio.Pizarra;
/*Elastigirl.java
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
public class Elastigirl implements PoderesElastigirl {
    @Override
    public void superFuerza(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("SuperFuerza");
        p.out("");
        p.ofoto("superfuerza.jpg");
    }

    @Override
    public void peleaConRobots(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("Mueran Robots");
        p.out("");
        p.ofoto("fuerza.jpg");
    }

    @Override
    public void esquivar(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("Mala Suerte");
        p.out("");
        p.ofoto("esquiva.png");
    }

    @Override
    public void golpea(Pizarra p) {
        p.setVisible(true);
        p.out("");
        p.out("Muere!");
        p.out("");
        p.ofoto("golpe.jpg");
    }
}
