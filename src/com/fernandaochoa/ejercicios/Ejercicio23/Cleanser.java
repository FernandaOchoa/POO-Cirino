package com.fernandaochoa.ejercicios.Ejercicio23;
/* Cleanser.java
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
public class Cleanser {
    private String s = new String("Cleanser");
    
    public void append (String a){
        s += a;
    }
    
    public void dilute(){
        append("\n dilute()");
    }
    
    public void apply(){
        append("\n apply()");
    }
    
    public void scrub(){
        append("\n scrub()");
    }
    
    public void print(){
        System.out.println(s);
    }
    
    public static void main(String []args){
        Cleanser x = new Cleanser();
        
        x.dilute();
        x.apply();
        x.scrub();
        x.print();
    }
}//Ejercicio 23