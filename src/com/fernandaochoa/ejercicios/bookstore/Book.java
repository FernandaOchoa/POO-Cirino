package com.fernandaochoa.ejercicios.bookstore;

/* Book.java
Instituto Tecnológico de León
Ingeniería en Sistemas Computacionales
Programación Orientada a Objetos
Horario: Mar y Jue 7:00 - 8:45
         Vie 7:50 - 8:40
Nombre de la alumna: Guzmán Hernández, Francisco
                     Ibarra Muñoz, Arantxa Patricia
                     Ramírez Ochoa, Fernanda Monserrat
                     Rodríguez Borja, Flor Paulina
Ejercicio: 36
Fecha de entrega:
Fecha de entrega real:
 */
public class Book {
    private String title;
    private String author;
    private int pubYear;
    private double price;
    private String editor;

    public Book(String t, String a, int d, double p, String e) {
        if (t != null) title = t;
        if (a != null) author = a;
        if (p > 0) price = p;
        if (e != null) editor = e;
        pubYear = d;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public double getPrice() {
        return price;
    }

    public String getEditor() {
        return editor;
    }

    public String toString() {
        return author + ", " + title + ",  " + pubYear
                + ", " + price + ",  " + editor;
    }
}
