package com.fernandaochoa.ejercicios;

import java.util.Date;
/* Manager19.java
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
Ejercicio: 19
Fecha de entrega:
Fecha de entrega real:
 */
public class Manager19 extends Employee18 {
    private String department;
    private double bono;

    public Manager19() {

    }

    public Manager19(String name, double salary, Date bd, String dept,
                     double bono) { //Second
        super(name, salary, bd); //invoca al constructor de la superclase
        setDepto(dept);
        setBono(bono);
    }

    public Manager19(String name, double salary, String dept, double bono) { ///third
        super(name, salary);
        setDepto(dept);
        setBono(bono);
    }

    public Manager19(String name, String dept, double bono) { //fourth
        super(name);
        setDepto(dept);
        setBono(bono);
    }

    public Manager19(String dept, double bono) { //fiveth
        //super();
        setDepto(dept);
        setBono(bono);
    }

    public Manager19(String n, double s, int y, int m, int d,
                     String dep, double bono) { //sixth
        super(n, s, y, m, d);
        setDepto(dep);
        //super(n, s, y, m, d); no compila por que debe ser el primero y asi va
        setBono(bono);
    }

    public boolean setBono(double b) {
        if (b > 0) {
            bono = b;
            return true;
        } else return false;
    }

    public boolean setDepto(String d) {
        if (d.length() > 0) {
            department = d;
            return true;
        } else return false;
    }

    public String getDetails() {
        //call parent method
        return super.getDetails() + "\n Department: " + department
                + "\nBonus " + bono;
    }

    public String getDepartment(){  return department;  }
    public double getBono(){  return bono;  }

}
