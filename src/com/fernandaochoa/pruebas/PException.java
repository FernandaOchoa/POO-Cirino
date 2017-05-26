package com.fernandaochoa.pruebas;
import java.io.*;
/* PException.java
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
Ejercicio: 40
Fecha de entrega:
Fecha de entrega real:
 */
public class PException {
    public static void main(String[] args) throws IOException {
        int resp = 'S';
        int i = -1;
        
        while (resp == 's' || resp == 'S') {
            i++;
            System.out.println("Desea seguir corriendo? S/n:");
            try {
                resp = System.in.read();
                System.in.skip(2);
            } catch (IOException ioe) {}
        }
        System.out.println("Usted dijo que si "+i+" veces.");
    }
}
