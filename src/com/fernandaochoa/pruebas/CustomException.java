package com.fernandaochoa.pruebas;
/* CustomException.java
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
public class CustomException {
    public static void main(String args[]){
       try{
          throw new MyException("Custom");
          // I'm throwing user defined custom exception above
       }
       catch(MyException exp){
          System.out.println("Hi this is my catch block") ;
          System.out.println(exp) ;
       }
    }
}
