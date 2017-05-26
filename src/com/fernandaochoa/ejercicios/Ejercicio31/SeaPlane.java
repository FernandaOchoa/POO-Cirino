package com.fernandaochoa.ejercicios.Ejercicio31;

import com.fernandaochoa.ejercicios.Airplane;
import cstio.Pizarra;

/* Seaplane.java
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
public class SeaPlane extends Airplane implements Sailer {
    Pizarra p = new Pizarra();

    public void dock(){
        p.setVisible(true);
        p.out("");
        p.out("Dock");
        p.out("");
        p.ofoto("dockS.jpg");
    }
    public void cruise(){
        p.setVisible(true);
        p.out("");
        p.out("Cruise");
        p.out("");
        p.ofoto("cruiseS.jpg");
    }
}
