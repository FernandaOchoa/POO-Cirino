package com.fernandaochoa.pruebas;
/* Point.java
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
Ejercicio: 38
Fecha de entrega:
Fecha de entrega real:
 */
public class Point {
    private double x, y;
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public String toString(){
    return "(" + x + ", " + y + ")";
    }
    
    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Point(String cad){
        int coma;
        
        if(cad.trim().matches("-?.[0-9]+.?[0-9]* *,*-?[0-9]+.?[0-9]*")){
            coma = cad.indexOf(",");
            setX(Double.parseDouble(cad.substring(0, coma).trim()));
            setY(Double.parseDouble(cad.substring(
                    coma+1, cad.length()).trim()));
        }
    }
}
