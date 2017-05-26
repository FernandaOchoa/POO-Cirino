/* OrangeJuice
*  Anderson, Franceschi
*/
package com.fernandaochoa.ejercicios.Ejercicio26;
/* OrangeJuice.java
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

public class OrangeJuice extends Item {
    public OrangeJuice(double p) {
        super(p);
    }

    public void draw(Graphics g, int startX, int endX, int y, Color eraseColor) {
        DecimalFormat money = new DecimalFormat("$0.00");
        String display1 = "Orange Juice:  Unit price = " + money.format(price);

        g.setColor(Color.BLUE);
        g.drawString(display1, 20, 50);
        for (int x = startX; x < endX; x += 5) {
            g.setColor(new Color(244, 244, 102));
            g.fillRect(x, y - 68, 30, 65);
            g.setColor(Color.LIGHT_GRAY);
            g.drawLine(x, y - 52, x + 30, y - 52);
            g.setColor(Color.BLACK);
            g.drawString("OJ", x + 7, y - 38);
            g.setColor(new Color(255, 132, 41));
            g.fillOval(x + 8, y - 33, 15, 17);
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
