package com.fernandaochoa.pruebas;
/* PruebaPoint.java
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
Ejercicio: 38
Fecha de entrega:
Fecha de entrega real:
 */
public class PruebaPoint {
    Point p;
    
    void inicio(){
        System.out.println("Provoca una excepcion:");
    }
    
    void datos(){}
    void calculos(){}
    
    void resultados(){
        System.out.println("El valor de las coordenadas es:" + p.toString());
    }
    
    public static void main(String[] args) {
        PruebaPoint pp = new PruebaPoint();
        
        pp.inicio();
        pp.resultados();
    }
}