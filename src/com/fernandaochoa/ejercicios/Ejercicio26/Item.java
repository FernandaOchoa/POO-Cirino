/* Item
    Anderson, Franceschi
*/

package com.fernandaochoa.ejercicios.Ejercicio26;
/* Item.java
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

import java.awt.*;

public abstract class Item {
    protected double price;

    public Item(double p) {
        price = p > 0 ? p : 0;
    }

    public void setPrice(double newPrice) {
        price = newPrice > 0 ? newPrice : 0;
    }

    public double getPrice() {
        return price;
    }

    public abstract void draw(Graphics g, int startX, int endX,
                              int y, Color eraseColor);
}
//Ejercicio 25