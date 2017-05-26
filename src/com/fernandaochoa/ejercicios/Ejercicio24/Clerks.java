package com.fernandaochoa.ejercicios.Ejercicio24;

/* Clerks.java
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
Ejercicio: 24
Fecha de entrega:
Fecha de entrega real:
 */
class OrderTaker {
    private String name;
    private double basePay;
    private int orderTaken;

    public boolean setName(String newValue) {
        if (name.length() > 0) {
            name = newValue;
            return true;
        } else
            return false;

    }

    public boolean setBasePay(double newValue) {
        if (basePay >= 0) {
            basePay = newValue;
            return true;
        } else
            return false;
    }

    public void incrementOrdersTaken() {
        orderTaken++;
    }

    public String getName() {
        return name;
    }

    public double getBasePay() {
        return basePay;
    }

    public int getOrderTaken() {
        return orderTaken;
    }

    //Generic order takers get a weekley portion of their salary
    public double calculatePay() {
        return getBasePay() / 52;
    }

}

class CSR extends OrderTaker {
    public double calculatePay() {
        //CSR get their weekley pay plus 10 cents per order they take
        return getBasePay() / 52 + getOrderTaken() * .1;
    }
}

class OEC extends OrderTaker {
    public double calculatePay() {
        //OEC get their weekley pay plus 1 cent per order they take
        return getBasePay() / 52 + getOrderTaken() * .01;
    }
}

class Telemarketer extends OrderTaker {
    private int pleopleHarassed;

    public void incrementPeopleHarassed() {
        pleopleHarassed++;
    }

    public int getPleopleHarassed() {
        return pleopleHarassed;
    }

    public double calculatePay() {
        double temp;
        //Telemarketers get 10 cent for every order they take and 1 cent per
        //person they harass (call)
        temp = getBasePay() / 52 + pleopleHarassed * .01 + getOrderTaken() * .1;
        return temp;
    }
}

class Clerks {
    public static void main(String[] args) {
        OrderTaker first, second, fourth;

        first = new OEC();
        second = new CSR();
        Telemarketer third = new Telemarketer();
        fourth = new OrderTaker();

        first.setBasePay(52000);
        second.setBasePay(52000);
        third.setBasePay(52000);
        fourth.setBasePay(52000);
        first.incrementOrdersTaken();
        first.incrementOrdersTaken();
        second.incrementOrdersTaken();
        third.incrementOrdersTaken();
        third.incrementOrdersTaken();
        third.incrementPeopleHarassed();
        //llamadas polimorficas
        System.out.println("First made " + first.calculatePay());
        System.out.println("Second made " + second.calculatePay());
        System.out.println("Third made " + third.calculatePay());
        System.out.println("Fourth made " + fourth.calculatePay());
    }
}