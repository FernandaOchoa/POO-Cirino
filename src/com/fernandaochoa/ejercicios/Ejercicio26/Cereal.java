/* Cereal
*  Anderson, Franceschi
*/
package com.fernandaochoa.ejercicios.Ejercicio26;
/* Cereal.java
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
Ejercicio: 26
Fecha de entrega:
Fecha de entrega real:
 */

import java.awt.*;
import java.text.DecimalFormat;

public class Cereal extends Item {
    public Cereal(double p) {
        super(p);
    }

    //concreta el metodo polimorfico para dibujar el cereal
    public void draw(Graphics g, int startX, int endX, int y, Color eraseColor) {
        DecimalFormat money = new DecimalFormat("$0.00");

        String display1 = "Cereal:  Unit price = " + money.format(price);
        g.setColor(Color.blue);
        g.drawString(display1, 20, 50);

        for (int x = startX; x < endX; x += 5) {
            g.setColor(new Color(255, 255, 51));
            g.fillRect(x, y - 68, 48, 65);
            g.setColor(Color.BLACK);
            g.drawString("Cereal", x + 5, y - 45);
            g.setColor(Color.RED);
            g.drawOval(x + 18, y - 35, 8, 8);
            g.drawOval(x + 13, y - 30, 8, 8);
            g.drawOval(x + 23, y - 30, 8, 8);
            g.fillArc(x + 10, y - 35, 24, 25, 0, -180);
            try {
                Thread.sleep((int) (100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // erase
            g.setColor(eraseColor); // background
            g.fillRect(x, y - 70, 50, 70);
        }
    }
}