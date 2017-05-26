package com.fernandaochoa.tareas.Tarea5;

import cstio.Dialog;
import cstio.Pizarra;

/*Comic.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Programación Orientada a Objetos.
  Martes - Jueves 7:00/8:40 Viernes 7:50/8:40
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: ____5___
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class Comic {
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    Elastigirl elastigirl = new Elastigirl();
    Syndrome syndrome = new Syndrome();

    String aux;
    int opcion;

    public void meta() {
        p.out("Tarea de interfaces con Elastigirl");
    }

    public void datos() {

    }

    public void calculos() {

    }
    public boolean isNum(String cant) {
        try {
            Integer.parseInt(cant);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("No has ingresado un valor");
            return false;
        }
    }

    public void resultados() {
       syndrome.disparar(p);
       elastigirl.esquivar(p);
       syndrome.llamarRobots(p);
       elastigirl.peleaConRobots(p);
       syndrome.superFuerza(p);
       elastigirl.superFuerza(p);
       syndrome.volar(p);
       elastigirl.golpea(p);
       syndrome.muere(p);
    }

    public int menu(){
        String msg ="1) Mostrar comic\n";
        msg+="2) Salir";
        do aux = d.readString(msg);
        while (!isNum(aux)) ;
        opcion = (Integer.parseInt(aux));
        return opcion;
    }

    public static void main(String[] args) {
        Comic co = new Comic();
        int opcion=0;

        co.meta();
        while ((opcion=co.menu())!=2)
            co.resultados();
    }
}
