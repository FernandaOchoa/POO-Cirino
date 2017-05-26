/*import bookstore.*;
  Solo se hace import cuando esta fuera del paquete
*/
package com.fernandaochoa.ejercicios;

import com.fernandaochoa.ejercicios.bookstore.Book;
import cstio.Pizarra;
/* BookDemo.java
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
Ejercicio: 37
Fecha de entrega:
Fecha de entrega real:
 */

//Demostración del uso de un paquete
class BookDemo{
  Pizarra pi = new Pizarra();
  Book book[] = new Book[5];

  void inicio() {
    pi.out("Se despliega el arreglo de Book con 5 elementos.");
    pi.setVisible(true);
  }

  void data(){
    book[0] = new Book ("java Beginner's Guide",
                          "Schildt", 2001,
                          240, "McGraw Hill");
    book[1] = new Book ("java 2 Programmer's Reference",
                          "Schildt", 2000,
                          340, "McGraw Hill");
    book[2] = new Book ("HTML Programmer's Reference",
                          "Powell and Whitworth",
                          1998, 280, "Pearson");
    book[3] = new Book ("Red Storm Rising",
                          "Clancy", 1986,
                          365, "O'Really");
    book[4] = new Book ("On the Road", "Kerouac", 1955,
                          200, "PHI");
  }

  void show(int i){
    pi.out(book[i].getTitle());
    pi.out(book[i].getAuthor());
    pi.out(book[i].getPubYear()+"");
    pi.out(book[i].getEditor());
    pi.out(book[i].getPrice()+"\n");
  }

  public static void main (String args[]){
    BookDemo bd = new BookDemo();

    bd.inicio();
    bd.data();
    for(int i = 0; i < bd.book.length; i++)
    //bd.show(i) lo mismo que...
    bd.pi.out(bd.book[i].toString()+"\n");
  }
}
