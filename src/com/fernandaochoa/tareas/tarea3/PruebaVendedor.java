package com.fernandaochoa.tareas.tarea3;

import cstio.Dialog;
import cstio.Pizarra;
import java.io.IOException;

/*PruebaVendedor.java
  Instituto Tecnológico de León
  Ingeniería en Sistemas Computacionales
  Programación Orientada a Objetos.
  Martes - Jueves 7:00/8:40 Viernes 7:50/8:40
  Alumno (a): Ramírez Ochoa Fernanda Monserrat
  Foto Digital del alumno (a)
  Tarea #: ____3___
  Fecha de entrega pactada:_________
  Fecha de entrega actual:__________
*/
public class PruebaVendedor {
    Vendedor ven = new Vendedor();
    Dialog d = new Dialog();
    Pizarra p = new Pizarra();

    Vendedor vendedor[] = new Vendedor[5];
    String di, ga;
    int cuenta, co = 1, dias;
    double total = 0, val, ganancia, comision, porcentaje;

    public void Meta() {
        d.display("Una empresa desea calcular las comisiones de su personal. \n" +
                "Cada vendedor recibe 200 + 9% de las ventas brutas de esa semana, \n" +
                "Por ejemplo una persona que vende 5000 osea un total de 650. \n" +
                "Desarrolle un algoritmo qye le permita escribir un programa para calcular \n" +
                "Las ganancias de cada vendedor de la empresa, y el porcentaje de \n" +
                "vendedores que ganan mas por comision que por sueldo, debera reportar \n" +
                "La lista de vendedores con tres columnas: \n" +
                "Nombre del vendedor, Comision Obtenida, Total de la Semana");
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

    public void Datos(Vendedor v) {
        String ven, aux, nom, centinela = "";
        int i = 0;

        while (!(centinela).equalsIgnoreCase("stop")) {
            do aux = d.readString("Ingresa el nombre del vendedor, stop para salir: ");
            while (aux.isEmpty());
            nom = aux;
            centinela = aux;
            if ((centinela).equalsIgnoreCase("stop"))
                break;
            do ven = d.readString("\n Ingrese las ventas brutas del vendedor: \n");
            while (!isNum(ven));
            val = (Double.parseDouble(ven));
            do di = d.readString("Ingresa los dias de la semana trabajados");
            while (!isNum(di));
            dias = (Integer.parseInt(di));
            vendedor[cuenta] = new Vendedor();
            vendedor[cuenta].setNombreVendedor(nom);
            vendedor[cuenta].setVentasBrutas(val);
            vendedor[cuenta].setDiasTrabajados(dias);
            comision = vendedor[cuenta].getVentasBrutas() * 0.09;
            vendedor[cuenta].setComisionObtenida(comision);
            cuenta++;
        }
    }

    public void Calculos() {
        dias = dias * 200;
        //comision = val *0.09;
        ganancia = comision + dias;
        for (int i = 0; i >= cuenta; i++) {
            if (comision >= dias)
                co++;
        }
        porcentaje = (co / cuenta) * 100;
    }

    public void Resultados() {

        p.setVisible(true);
        p.out("Examen de Fernanda Ochoa \n\n");
        p.out("Nombre del vendedor " + "\t Comision Obtenida " + "\t Total \n");

        for (int i = 0; i < cuenta; i++) {
            p.out(vendedor[i].getNombreVendedor() + "\t\t\t\t "
                    + vendedor[i].getComisionObtenida()
                    + "\t\t" + ganancia);
            p.out("\n");
        }

        p.out("\nEl porcentaje de empleados que ganan mas por comision que por ventas: " +
                porcentaje);
    }

    public static void main(String[] args) throws IOException {

        PruebaVendedor pruebaVendedor = new PruebaVendedor();
        String resp = "s";
        Dialog d = new Dialog();

        pruebaVendedor.Meta();
        while (resp.equals("s") || resp.equals("S")) {
            pruebaVendedor.Datos(pruebaVendedor.ven);
            pruebaVendedor.Calculos();
            pruebaVendedor.Resultados();

            resp = d.readString("¿Desea calcular mas comisiones?");
            if (resp.equals("n") || resp.equals("N")) {
                System.exit(0);
            }
            System.in.skip(2);
        }

    }
}