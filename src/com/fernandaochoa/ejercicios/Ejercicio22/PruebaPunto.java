/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernandaochoa.ejercicios.Ejercicio22;

/* PruebaPunto.java
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
Ejercicio: 22
Fecha de entrega:
Fecha de entrega real:
 */

import cstio.Dialog;

public class PruebaPunto {
    Dialog d = new Dialog();
    Punto punto1;
    Punto punto2;

    public static void main(String args[]) {
        PruebaPunto ppm = new PruebaPunto();

        ppm.meta();
        ppm.datos();
        ppm.calculos();
        ppm.resultados();
    }

    public void meta() {
        d.display("Favor de modelar un algoritmo para calcular la distancia\n"
                + " entre 2 puntos del plano cartesiano, capture cada punto "
                + "\n usando el constructor del ejercicio 21. Y codifique \n"
                + "su clase prueba en su lenguaje favorito OO, teclear, \n"
                + "guardar compilar, depurar y correr.\n");
    }

    //2.-datos
    public void datos() {
        Double x1, x2, y1, y2;
        String v;
        do v = d.readString("Ingresa el valor de x1");
        while (!isNum(v));
        x1 = Double.parseDouble(v);
        do v = d.readString("Ingresa el valor de y1");
        while (!isNum(v));
        y1 = Double.parseDouble(v);
        punto1 = new Punto(x1, y1);
        do v = d.readString("Ingresa el valor de x2");
        while (!isNum(v));
        x2 = Double.parseDouble(v);
        do v = d.readString("Ingresa el valor de y2");
        while (!isNum(v));
        y2 = Double.parseDouble(v);
        punto2 = new Punto(x2, y2);
    }

    //3.-calculos
    public double calculos() {
        double resultado = Math.sqrt(Math.pow((punto2.getX() - punto1.getX()), 2)
                + Math.pow((punto2.getY() - punto1.getY()), 2));
        return resultado;
    }

    //4.-resultados
    public void resultados() {
        d.display("La distancia entre la coordenada: \n"
                + punto1.getX() + ", " + punto1.getY() + "\n"
                + "y la coordenada:\n"
                + punto2.getX() + ", " + punto2.getX() + "\n"
                + "el resultado es: " + calculos());
    }

    boolean isNum(String cad) {
        Dialog d = new Dialog();
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("solo se admiten valores numericos");
        }
        return false;
    }

}