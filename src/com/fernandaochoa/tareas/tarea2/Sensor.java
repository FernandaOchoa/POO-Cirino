package com.fernandaochoa.tareas.tarea2;

/*Sensor.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Programación Orientada a Objetos.
  Martes - Jueves 7:00/8:40 Viernes 7:50/8:40
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: ____2___
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class Sensor {

    private String nombre;
    private int id;
    private double valor;

    public boolean setNombre(String nom){
        if (!nom.isEmpty()){
            nombre = nom;
            return true;
        } else return false;
    }

    public boolean setId(int i) {
        if (i > 0) {
            id = i;
            return true;
        } else return false;
    }

    public boolean setValor(double v) {
        if (v > 0) {
            valor = v;
            return true;
        } else return false;
    }

    public String getNombre() {  return nombre;  }
    public int getId() {  return id;  }
    public double getValor() {  return valor;  }
}
