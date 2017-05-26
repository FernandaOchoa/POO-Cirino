package com.fernandaochoa.ejercicios;

import java.util.Date;
import java.util.GregorianCalendar;
/* Employee18.java
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
Ejercicio: 18
Fecha de entrega:
Fecha de entrega real:
 */
public class Employee18 { //mutable
    private String name;
    private double salary;
    private Date birthDate;
    //private String place; Puesto laboral

    public Employee18() {
        //constructor por defecto
    }

    public Employee18(String name) { //constructor sobrecargado
        if (name.length() != 0)
            this.name = name;
    }

    public Employee18(String name, double salary) {
        if (name.length() != 0)
            this.name = name;
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    /*
    public Employee18(String name, double salary, String p){
        this(n, s);
        if (p.length() !=0)
            place = p;

     }

     */
    public Employee18(String n, double s, int year, int month, int day) {
        /* GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
            birthDate = calendar.getTime();
        * */
        this(n, s);
        setBirthDate(year, month, day);
    }

    public Employee18(String name, double salary, Date bd) {
        if (name.length() != 0)
            this.name = name;
        if (salary >= 0)
            this.salary = salary;
        if (bd != null)
            birthDate = bd;
    }

    public String getDetails() {
        return "Name: " + name + "\nSalary: " + salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    // public String getPlace(){  return place;}

    public boolean setName(String n) {
        if (!name.isEmpty()) {
            name = n;
            return true;
        } else return false;
    }

    public boolean setBirthDate(int d, int m, int y) {
        if (d > 0 && m > 0 && y > 0) {
            GregorianCalendar calendar = new GregorianCalendar(y, m - 1, d);

            birthDate = calendar.getTime();
            return true;
        } else return false;
    }

    public boolean setBirthDate(Date d) {
        if (d != null) {
            birthDate = d;
            return true;
        } else return false;
    }

    public boolean setSalary(double s) {
        if (s > 0) {
            salary = s;
            return true;
        } else return false;
    }

    /* public boolean setPlace(String p){
        if (p.lenght() != 0){
            place = p;
            return true;
        } else return false;
       }
     */
}
