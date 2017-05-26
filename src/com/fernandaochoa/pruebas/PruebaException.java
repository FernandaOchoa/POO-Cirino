package com.fernandaochoa.pruebas;
/* PruebaException.java
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
Ejercicio: 39
Fecha de entrega:
Fecha de entrega real:
 */
public class PruebaException {
    Point p;
    //Pizarra pi = new Pizarra();
    
    public static void main(String[] args) {
        PruebaException pe = new PruebaException();
        
        try {
            pe.p.setX(22.5);
            pe.p.setY(33.6);
            System.out.println("El punto p esta en:" +pe.p.toString());
        } catch (NullPointerException npe) {
            System.out.println("No se permiten apuntadores nulos");
            System.out.println("y p es nulo");
        }
        finally {
            System.out.println("Si se ha manejado la excepcion.");
        }
        //pe.pi.setVisible(true);
    }
}