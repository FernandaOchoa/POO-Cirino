package com.fernandaochoa.ejercicios;

/* BoxG.java
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
public class BoxG<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
