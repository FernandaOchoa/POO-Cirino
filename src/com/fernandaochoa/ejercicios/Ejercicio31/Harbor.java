package com.fernandaochoa.ejercicios.Ejercicio31;

/* Harbor.java
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
public class Harbor {
    public static void main(String[] args) {
        Harbor bostonHarbor = new Harbor();
        RiverBarge barge = new RiverBarge();
        SeaPlane sPlane = new SeaPlane();

        bostonHarbor.givePermissionToDock(barge);
        bostonHarbor.givePermissionToDock(sPlane);
    }

    private void givePermissionToDock(Sailer s) {
        s.dock();       //llamada polimorfica
    }
}
