package com.fernandaochoa.ejercicios.Ejercicio12;
/* Mascota.java
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
Ejercicio: 12
Fecha de entrega:
Fecha de entrega real:
 */

import cstio.Dialog;
import cstio.Pizarra;

public class Mascota {

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    int cuenta;
    String t;
    Mamifero m[] = new Mamifero[10];

    void inicio() {
        String aux = "\t\tMascota";
        String msg = "\t\t\nPara aceptar una lista de mamiferos cualquiera,";
        msg += "\t\t\nen un arreglo de apuntadores a objetos tipo mamifero ";
        msg += "\t\t\ndesplegando la lista.";
        p.out(aux + msg);
        p.setVisible(true);
    }

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se admiten valores numericos.");
        }
        return false;
    }

    void datos() {
        String nombre, color, aux;
        int patas;

        do nombre = d.readString("Deme el nombre del mamifero o fin:");
        while (nombre.isEmpty());

        while (!(nombre).equalsIgnoreCase("fin") && cuenta < 10) {
            do color = d.readString("Ingrese el color de su mascota:");
            while (color.isEmpty());

            do aux = d.readString("Ingrese el numero de "
                    + "patas de su mascota:");
            while (!isNum(aux));
            patas = Integer.parseInt(aux);
            menuTipo();
            m[cuenta].setNombre(nombre);
            m[cuenta].setColorDePelo(color);
            m[cuenta].setNumeroDePatas(patas);
            cuenta++;
            nombre = d.readString("Deme el nombre del mamifero o fin:");
        }
    }

    void calculos() {
    }//no hay 

    void resultados() {
        p.out("\n\nSu lista de mamiferos contiene:");
        p.out("\n-------------------------------------");
        p.out("\nNombre     Color       Patas       Mordidas        "
                + "Trucos       Ratones     Arañados\n");

        for (int i = 0; i < cuenta; i++) {
            p.out("\n" + m[i].getNombre());
            p.out("     " + m[i].getColorDePelo());
            p.out("       " + m[i].getNumeroDePatas());
            if (m[i] instanceof Perro) {
                Perro pet;
                pet = (Perro) m[i];
                p.out("       " + pet.getMordidas());
                p.out("       " + pet.getTrucos());
            } else if (m[i] instanceof Gato) {
                Gato pet;
                pet = (Gato) m[i];
                p.out("       " + pet.getRatonesCazados());
                p.out("     " + pet.getArañados());
            }
        }
    }

    void navegabilidad() {
    } //automatica.

    void menuTipo() {
        String msg = "\n\n\t\tMENU DE ANIMALES";
        msg += "\nElija la letra que prefiera:";
        msg += "\n--------------------";
        msg += "\nm - para cualquier tipo de mamifero";
        msg += "\np - para un perro";
        msg += "\ng - para un gato";
        do t = d.readString(msg + "\nSu eleccion:");
        while (msg.isEmpty());

        switch (t) {
            case "p":
                capturaPerro();
                break;
            case "g":
                capturaGato();
                break;
            case "m":
                m[cuenta] = new Mamifero();
                break;
        }
    }

    void capturaPerro() {
        String aux, mo, tr;
        m[cuenta] = new Perro();
        Perro pet;
        pet = (Perro) m[cuenta];

        aux = "A cuantas personas ha mordido?";
        do mo = d.readString(aux);
        while (!isNum(mo));
        aux = "Cuantos trucos sabe?";
        do tr = d.readString(aux);
        while (!isNum(tr));
        pet.setMordidas(Integer.parseInt(mo));
        pet.setTrucos(Integer.parseInt(tr));
    }

    void capturaGato() {
        String aux;
        String r, a;
        m[cuenta] = new Gato();
        Gato pet;
        pet = (Gato) m[cuenta];

        aux = "Numero de ratones que ha cazado:";
        do r = d.readString(aux);
        while (!isNum(r));
        aux = "A cuantas personas ha arañado?";
        do a = d.readString(aux);
        while (!isNum(a));
        pet.setRatonesCazados(Integer.parseInt(r));
        pet.setArañados(Integer.parseInt(a));
    }

    public static void main(String args[]) {
        Mascota pm = new Mascota();

        pm.inicio();
        pm.datos();
        pm.calculos();
        pm.resultados();
    }//main
}//class
//Ejercicio 12