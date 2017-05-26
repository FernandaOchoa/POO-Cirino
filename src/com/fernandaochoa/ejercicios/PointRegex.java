package com.fernandaochoa.ejercicios;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* PointRegex.java
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
Ejercicio: 21
Fecha de entrega:
Fecha de entrega real:
 */
public class PointRegex {

    private int x, y;
    String x1 = String.valueOf(x);
    String y1 = String.valueOf(x);
    Pattern pat = Pattern.compile("-?[0-9]+.?[0-9]* *,*-?[0-9]*");

    public PointRegex() {

    }
    public PointRegex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointRegex(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
        Matcher mx = pat.matcher(x1);
        Matcher my = pat.matcher(y1);
        if (mx.find() && my.find()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }
    }


    public static void main(String[] args) {

        System.out.println("Escribe el valor de x: ");
        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble();

        System.out.println("Escribe el valor de y: ");
        Scanner s = new Scanner(System.in);
        Double y = sc.nextDouble();

        PointRegex p = new PointRegex(x, y);

        System.out.println("El valor para x es: " + p.x +
                "\nEl valor para y es: " + p.y);

    }
}
