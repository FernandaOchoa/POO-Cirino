package com.fernandaochoa.ejercicios.Ejercicio31;

import cstio.Pizarra;

/* RiverBarge.java
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
Ejercicio: 31
Fecha de entrega:
Fecha de entrega real:
 */
public class RiverBarge implements Sailer {
    Pizarra p = new Pizarra();

    @Override
    public void dock() {
        p.setVisible(true);
        p.out("");
        p.out("Dock");
        p.out("");
        p.ofoto("dockB.jpg");
    }

    @Override
    public void cruise() {

        p.setVisible(true);
        p.out("");
        p.out("Dock");
        p.out("");
        p.ofoto("cruiseB.jpg");

    }
}
