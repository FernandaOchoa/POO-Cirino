/* Milk
*  Anderson, Franceschi
*/
package com.fernandaochoa.ejercicios.Ejercicio26;
/* Milk.java
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

public class Milk extends Item {
    public Milk(double p) {
        super(p);
    }

    public void draw(Graphics g, int startX, int endX, int y, Color eraseColor) {
        DecimalFormat money = new DecimalFormat("$0.00");
        String display1 = "Milk:  Unit price = " + money.format(price);

        g.setColor(Color.BLUE);
        g.drawString(display1, 20, 50);
        for (int x = startX; x < endX; x += 5) {
            g.setColor(Color.WHITE);
            g.fillRect(x + 1, y - 67, 30, 65);
            g.setColor(Color.LIGHT_GRAY);
            g.drawLine(x, y - 55, x + 30, y - 55);
            g.drawRect(x, y - 68, 31, 66);
            g.setColor(Color.BLACK);
            g.drawString("Milk", x + 3, y - 44);
            try {
                Thread.sleep((int) (100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // erase
            g.setColor(eraseColor);
            g.fillRect(x, y - 70, 50, 70);
        }
    }
}