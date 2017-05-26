package com.fernandaochoa.tareas.tarea2;

import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/*Sensado.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Programación Orientada a Objetos.
  Martes - Jueves 7:00/8:40 Viernes 7:50/8:40
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: ____2___
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/


public class Sensado {

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    Sensor sense = new Sensor();

    Sensor sensors[] = new Sensor[5];
    double[] numeroS = new double[5];
    int cuenta = 0;

    public void Meta() {
        d.display("Para mostrar el valor que contiene cada sensor");
    }

    public boolean isNum(String cant) {
        try {
            Integer.parseInt(cant);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("No se ha registrado un valor");
            return false;
        }
    }

    public void Datos(Sensor s) {

        String aux, nom, v, ide, centinela = "";
        int i = 0;


        while (!(centinela).equalsIgnoreCase("stop")) {
            do aux = d.readString("Ingresa el nombre del sensor, stop para salir: ");
            while (aux.isEmpty());

            nom = aux;
            centinela = aux;

            if ((centinela).equalsIgnoreCase("stop"))
                break;

            do ide = d.readString("Ingrese el id del sensor: ");
            while (!isNum(ide));
            int id = (Integer.parseInt(ide));

            do aux = d.readString("\n Ingrese la cantidad de sensores: \n");
            while (!isNum(aux));
            double c = (Integer.parseInt(aux));
            try {
                numeroS[cuenta] = c;
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Excede el limite del arreglo");
            }

            do v = d.readString("\n Ingrese el valor del sensor : \n");
            while (!isNum(aux));
            double val = (Double.parseDouble(v));


            sensors[cuenta] = new Sensor();
            sensors[cuenta].setNombre(nom);
            sensors[cuenta].setValor(val);
            sensors[cuenta].setId(id);

            cuenta++;
        }
    }

    public void Resultados() {
        p.setVisible(true);
        p.out("Resultado por sensor \n");
        for (int i = 0; i < cuenta; i++) {
            p.out("Nombre: " + sensors[i].getNombre() + "\n");
            p.out("Cantidad de Sensores " + numeroS[i] + "\n");
            p.out("Id: " + sensors[i].getId() + "\n");
            p.out("Valor: " + sensors[i].getValor() + "\n");
            p.ofoto("sensor.jpg");
        }
    }

    public static void main(String[] args) throws IOException {
        Sensado sensado = new Sensado();

        String resp = "s";
        Dialog d = new Dialog();

        sensado.Meta();
        while (resp.equals("s") || resp.equals("S")) {
            sensado.Datos(sensado.sense);
            sensado.Resultados();

            resp = d.readString("¿Desea visualizar otro sensor?");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}