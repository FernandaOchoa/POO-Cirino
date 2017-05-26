package com.fernandaochoa.ejercicios;

/* Moneda.java
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
Ejercicio: 2
Fecha de entrega:
Fecha de entrega real:
 */

public class Moneda {
    private double valor;
    private String escudo, pais, divisa;
    private int año;

    public boolean setValor(double v){
        if (v > 0){
            valor = v;
            return true;
        } else return false;
    }

    public boolean setEscudo(String e){
        if (!e.isEmpty()){
            escudo = e;
            return true;
        } else return false;
    }

    public boolean setPais(String p){
        if (!p.isEmpty()){
            pais = p;
            return true;
        } else return false;
    }

    public boolean setDivisa(String d){
        if (!d.isEmpty()){
            divisa = d;
            return true;
        } else return false;
    }

    public boolean setAño(int a){
        if (a > 0){
            año = a;
            return true;
        } else return false;
    }

    public double getValor() {  return valor;  }
    public String getEscudo(){  return escudo; }
    public String getPais()  {  return pais;   }
    public String getDivisa(){  return divisa; }
    public int getAño()      {  return año;    }
}
