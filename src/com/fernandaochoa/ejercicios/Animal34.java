package com.fernandaochoa.ejercicios;

import java.util.LinkedList;
import java.util.List;

/* Animal34.java
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
Ejercicio: 34
Fecha de entrega:
Fecha de entrega real:
 */
public class Animal34 {
    public void eat() {
        System.out.println("Comiendo como un animal cualquiera");
    }

    public static void main(String[] args) {
        List<Animal34> animals = new LinkedList<Animal34>();
        animals.add(new Animal34());
        animals.add(new Wolf());
        animals.add(new Fish());
        animals.add(new OtherAnimal());

        for (Animal34 currentAnimal : animals) {
            currentAnimal.eat();
        }
    }
}

class Wolf extends Animal34 {
    @Override
    public void eat() {
        System.out.println("Comiendo como lobo");
    }
}

class OtherAnimal extends Animal34 {
    @Override
    public void eat() {
        System.out.println("Comiendo como una tortuga");
    }
}

class Fish extends Animal34 {
    @Override
    public void eat() {
        System.out.println("Comiendo como un pez");
    }
}

class PezDorad extends Fish {
    @Override
    public void eat() {
        System.out.println("Comiendo como pez dorado");
    }
}

