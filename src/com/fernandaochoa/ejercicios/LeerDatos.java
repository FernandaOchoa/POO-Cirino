package com.fernandaochoa.ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* LeerDatos.java
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
Ejercicio: 42
Fecha de entrega:
Fecha de entrega real:
 */
public class LeerDatos {
    double A[] = new double[50];

    public void inicio(){
        System.out.println("Programa para ilustrar la lectura de archivos");
        System.out.println("para manipular sus datos: \n");
    }
    public void datosIn(String file){
        try{
            Scanner in = new Scanner(new File(file));
            String s;
            int i = 0;
            while (in.hasNextLine()){
                s= in.nextLine();
                A[i++]=Double.parseDouble(s);
                //System.out.println(s);

            }
            in.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public void reporta() {
        for (int i =0; i < A.length & A[i] !=0.0 ; i++){
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args)  {
        LeerDatos wf = new LeerDatos();
        wf.inicio();
        wf.datosIn(args[0]);
        wf.reporta();
    }
}
