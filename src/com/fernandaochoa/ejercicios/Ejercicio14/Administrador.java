package com.fernandaochoa.ejercicios.Ejercicio14;

import java.util.Date;
/* Administrador.java
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
Ejercicio: 14
Fecha de entrega:
Fecha de entrega real:
 */

public class Administrador extends Empleado {
    private String depto;
    private double bono;

    public boolean setDepto(String d) {
        if (d.length() != 0) {
            depto = d;
            return true;
        } else {
            return false;
        }
    }

    public boolean setBono(double b) {
        if (b > 0) {
            bono = b;
            return true;
        } else {
            return false;
        }
    }

    public String getDepto() {
        return depto;
    }

    public double getBono() {
        return bono;
    }

    public String toString() {
        return super.toString() + "Departamento: " + depto
                + "Bono" + bono;
    }

    public Administrador(){}

    public Administrador(String n, double s, Date f, String d, double b) {
        super(n, s, f);
        depto = d;
        bono = b;
        setDepto(d);
        setBono(b);
    }

    public Administrador(String nombre, double salario, String depto,
                         double bono){
        super(nombre, salario);
        setDepto(depto);
        setBono(bono);
    }

    public Administrador(String nombre, String depto, double bono){
        super(nombre);
        setDepto(depto);
        setBono(bono);
    }

    public Administrador(String depto, double bono){
        super();
        setDepto(depto);
        setBono(bono);
    }

    public Administrador(String n, double s, int a, int m, int d,
                         String depto, double bono){
        super(n, s, a, m, d);
        setDepto(depto);
        setBono(bono);
    }
}
