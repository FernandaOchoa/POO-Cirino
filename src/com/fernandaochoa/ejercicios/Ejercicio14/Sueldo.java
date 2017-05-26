package com.fernandaochoa.ejercicios.Ejercicio14;

import cstio.Dialog;
import cstio.Pizarra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* Sueldo.java
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

public class Sueldo {

    Empleado emp = new Empleado();
    Administrador adm = new Administrador();
    Dialog d = new Dialog();
    Pizarra p = new Pizarra();

    void inicio() {
        String msg = "Sueldo";
        msg += "\nElaborar un programa que le permita capturar";
        msg += " empleados, especificando su nombre, salario y fecha";
        msg += " de nacimiento; si el empleados es un administrador";
        msg += " capture el departamento y su bono";
        msg += "\nTotalice la nomina de sus empleados separando";
        msg += " los subtotales de bono y de salario y reporte";
        msg += " la lista de ellos con sus datos.";
        p.out(msg);
        p.setVisible(true);
    }

    Empleado empleado[] = new Empleado[5];
    Administrador admin[] = new Administrador[5];
    int cuenta;
    double bono, salarios = 0, salarioA = 0, salarioE = 0, bonoT = 0, total = 0;
    String tipo = "";

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            d.display("Solo se admiten valores numericos.");
        }
        return false;
    }

    void datos(Empleado emp, Administrador adm) {
        String aux;
        Date nacimiento = null;
        double salario = 0;
        String centinela = "", nombre = "", depto = "";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        while (!(centinela).equalsIgnoreCase("stop")) {

            do aux = d.readString("Que tipo de empleado es? Elija:"
                    + "\nN - para normal"
                    + "\nA - para administrador"
                    + " o stop - para finalizar");
            while (aux.isEmpty());
            tipo = aux;
            centinela = aux;

            if ((centinela).equalsIgnoreCase("stop"))
                break;

            if (tipo.equals("A")) {
                do nombre = d.readString("Deme el nombre: ");
                while (nombre.isEmpty());

                do aux = d.readString("Deme el salario:");
                while (!isNum(aux));
                salario = Double.parseDouble(aux);


                do aux = d.readString("Fecha de nacimiento"
                        + " con formato (dd/MM/aaaa)");
                while (aux.isEmpty());
                try {
                    nacimiento = formatter.parse(aux);
                } catch (ParseException pe) {
                    pe.printStackTrace();
                }

                do depto = d.readString("Deme su departamento:");
                while (depto.isEmpty());


                do aux = d.readString("Deme el bono:");
                while (!isNum(aux));
                bono = Double.parseDouble(aux);

                admin[cuenta] = new Administrador();
                admin[cuenta].setNombre(nombre);
                admin[cuenta].setSalario(salario);
                admin[cuenta].setFechaNac(nacimiento);
                admin[cuenta].setDepto(depto);
                admin[cuenta].setBono(bono);
                salarioA = admin[cuenta].getSalario();
                bonoT = admin[cuenta].getBono();


            } else if (tipo.equals("N")) {

                do nombre = d.readString("Deme el nombre: ");
                while (nombre.isEmpty());

                do aux = d.readString("Deme el salario:");
                while (!isNum(aux));
                salario = Double.parseDouble(aux);


                do aux = d.readString("Fecha de nacimiento"
                        + " con formato (dd/MM/aaaa)");
                while (aux.isEmpty());
                try {
                    nacimiento = formatter.parse(aux);
                } catch (ParseException pe) {
                    pe.printStackTrace();
                }

                empleado[cuenta] = new Empleado();
                empleado[cuenta].setNombre(nombre);
                empleado[cuenta].setSalario(salario);
                empleado[cuenta].setFechaNac(nacimiento);
                salarioE = empleado[cuenta].getSalario();


            }
            cuenta++;
            calculos();
        }
    }

    void calculos() {
        for (int i = 0; i < cuenta; i++) {
            total = bonoT + salarioA;
            salarios = total + salarioE;
        }
    }

    void resultados() {
        p.out("\n Listado de Empleados:");
        p.out("\nNombre     Salario     Depto.      Bono");
        p.out("\n___________________________________________");

        if (tipo.equals("A"))
            getStringAdmin();
        else
            getStringEmpleado();

        p.out("_____________________________________________");
        p.out("\nTotal Salarios Administradores: " + total);
        p.out("\nTotal Salarios Empleados: " + salarioE);
        p.out("\nTotal Bonos: " + bonoT);
        p.out("\nTotal Nomina: " + salarios);

    }

    private void getStringEmpleado() {
        String tab = "\t";
        for (int i = 0; i < cuenta; i++) {
            p.out(empleado[i].getNombre() + tab + empleado[i].getSalario() + tab);
            p.out(empleado[i].getFechaNac() + tab);
            p.out("\n");
        }
    }

    private void getStringAdmin() {
        String tab = "\t";
        for (int a = 0; a < cuenta; a++) {
            p.out(admin[a].getNombre() + tab + admin[a].getSalario() + tab);
            p.out(admin[a].getFechaNac() + tab + admin[a].getBono() + tab);
            p.out("\n");
        }
    }

    void navegabilidad() {
    } // automatica

    public static void main(String[] args) {
        Sueldo s = new Sueldo();

        s.inicio();
        s.datos(s.emp, s.adm);
        // s.calculos();
        s.resultados();
    }

}