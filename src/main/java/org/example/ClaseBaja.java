package org.example;

public class ClaseBaja extends Sayayin {

    public ClaseBaja() {
    }

    public ClaseBaja(String nombre, Integer poderPelea, integer edad, String colorPelo) {
        super(nombre, poderPelea, edad, colorPelo);
    }

    @Override
    public void pelear() {
        System.out.println(this.getNombre()+"pelea con el colazon");

        }

    }

