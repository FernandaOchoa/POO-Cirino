package com.fernandaochoa.pruebas;
/* MyException.java
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
Ejercicio: 41
Fecha de entrega:
Fecha de entrega real:
 */
public class MyException extends Exception {
    String str1;
    MyException(String str2) {
       str1=str2;
    }
    public String toString(){ 
       return ("Output String = "+str1) ;
    }
}
