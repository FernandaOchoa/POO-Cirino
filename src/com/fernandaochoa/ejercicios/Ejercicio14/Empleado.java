package com.fernandaochoa.ejercicios.Ejercicio14;

import java.util.Date;
import java.util.GregorianCalendar;
/* Empleado.java
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

public class Empleado {
    private String nombre;
    private double salario;
    private Date fechaNac;
    private String puesto;

    public boolean setNombre(String n) {
        if (n.length() != 0) {
            nombre = n;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSalario(double s) {
        if (s > 0) {
            salario = s;
            return true;
        } else {
            return false;
        }
    }

    public boolean setFechaNac(Date f) {
        if (f != null) {
            fechaNac = f;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPuesto(String p) {
        if (p.length() != 0) {
            puesto = p;
            return true;
        } else return false;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getPuesto() {
        return puesto;
    }

    public String toString() {
        return "Nombre: " + nombre
                + "Salario: " + salario
                + "Fecha de Nacimiento: " + fechaNac;
    }

    public Empleado() {
    }

    public Empleado(String n, double s, Date f) {
        if (nombre.length() != 0) nombre = n;
        if (salario >= 0) salario = s;
        if (f != null) fechaNac = f;
    }


    public Empleado(String nombre) {
        if (nombre.length() != 0)
            this.nombre = nombre;
    }

    public Empleado(String nombre, double salario) {
        if (nombre.length() != 0)
            this.nombre = nombre;
        if (salario >= 0)
            this.salario = salario;
    }

    public Empleado(String n, double s, String p) {
        this(n, s);
        if (p.length() != 0)
            puesto = p;
    }

    public Empleado(String n, double s, int año, int mes, int dia) {
        this(n, s);
        GregorianCalendar calendario =
                new GregorianCalendar(año, mes - 1, dia);
        fechaNac = calendario.getTime();
    }
}


