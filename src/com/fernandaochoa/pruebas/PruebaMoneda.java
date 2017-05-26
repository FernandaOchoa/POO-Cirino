package com.fernandaochoa.pruebas;

import com.fernandaochoa.ejercicios.Moneda;
import cstio.Dialog;
import cstio.Pizarra;

import java.io.IOException;

/* PruebaMonera.java
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
Ejercicio: 4
Fecha de entrega:
Fecha de entrega real:
 */
public class PruebaMoneda {

    Moneda mon = new Moneda();
    Dialog d = new Dialog();
    Pizarra p = new Pizarra();


    public void Meta() {
        d.display("Para calcular el valor de un monedero digital");
    }

    Moneda moneda[] = new Moneda[5];
    double[] numeroM = new double[5];
    int cuenta;
    double total = 0;

    public boolean isNum(String cant) {
        try {
            Integer.parseInt(cant);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("No has ingresado un valor");
            return false;
        }
    }

    public void Datos(Moneda m) {
        String v, aux, e, di, centinela = "";
        int i = 0, valor;

        do aux = d.readString("Ingresa el pais de la moneda ");
        while (aux.isEmpty());
        m.setPais(aux);


        while (!(centinela).equalsIgnoreCase("stop")) {
            do aux = d.readString("Ingresa la divisa de la moneda, stop para salir: ");
            while (aux.isEmpty());
            di = aux;

            centinela = aux;
            if ((centinela).equalsIgnoreCase("stop"))
                break;

            do aux = d.readString("\n Ingrese el numero de monedas: \n");
            while (!isNum(aux));
            double c = (Double.parseDouble(aux));
            try {
                numeroM[cuenta] = c;
            } catch (ArrayIndexOutOfBoundsException aiobe){
                System.out.println("Excede el limite del arreglo");
            }
            do v = d.readString("\n Ingrese el valor de la moneda: \n");
            while (!isNum(aux));
            double val = (Double.parseDouble(v));

            do aux = d.readString("Ingrese el escudo de la moneda: ");
            while (aux.isEmpty());
            e = aux;

            moneda[cuenta] = new Moneda();
            moneda[cuenta].setValor(val);
            moneda[cuenta].setEscudo(e);
            moneda[cuenta].setDivisa(di);

            cuenta++;
        }
    }

    public void Calculos() {
        for (int i = 0; i == cuenta; i++) {
            total = total + moneda[cuenta].getValor() * numeroM[cuenta];
        }
    }

    public void Resultados() {

        p.setVisible(true);
        p.out("Monedero");

        String pais = (String) mon.getPais();
        String divisa = (String) mon.getDivisa();

        p.out("\n Pais: " + pais);

        for (int i = 0; i < cuenta; i++) {
            p.out("Numero de Monedas " + numeroM[i]+"\n");
            p.out("Valor: " + moneda[i].getValor()+"\n");
            p.out("Escudo: " + moneda[i].getEscudo()+"\n");
            p.out("Divisa: " + moneda[i].getDivisa()+"\n");
        }
        p.out("Total: " + total);
    }

    public static void main(String[] args) throws IOException {
        PruebaMoneda pruebaMoneda = new PruebaMoneda();
        String resp = "s";
        Dialog d = new Dialog();

        pruebaMoneda.Meta();
        while (resp.equals("s") || resp.equals("S")) {
            pruebaMoneda.Datos(pruebaMoneda.mon);
            pruebaMoneda.Calculos();
            pruebaMoneda.Resultados();

            resp = d.readString("¿Desea calcular otro monedero?");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }
    }
}
