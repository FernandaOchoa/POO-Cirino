package com.fernandaochoa.tareas.tarea3;

/*Vendedor.java
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
public class Vendedor {
    private String nombreVendedor;
    private double ventasBrutas;
    private double comisionObtenida;
    private int diasTrabajados;

    public boolean setNombreVendedor(String nom){
        if (!nom.isEmpty()){
            nombreVendedor = nom;
            return true;
        } else return false;
    }

    public boolean setVentasBrutas(double ventas){
        if (ventas > 0){
            ventasBrutas = ventas;
            return true;
        } else return false;
    }

    public boolean setComisionObtenida(double comision) {
        if (comision > 0) {
            comisionObtenida = comision;
            return true;
        } else return false;
    }
    public boolean setDiasTrabajados(int dias) {
        if (dias > 0 ){
            diasTrabajados = dias;
            return true;
        } else return false;
    }

    public String getNombreVendedor(){  return nombreVendedor;  }
    public double getVentasBrutas(){  return ventasBrutas;  }
    public double getComisionObtenida(){  return comisionObtenida;  }
    public int getDiasTrabajados(){  return diasTrabajados;  }
}
