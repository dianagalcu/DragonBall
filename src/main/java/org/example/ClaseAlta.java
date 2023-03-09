package org.example;

public class ClaseAlta extends Sayayin {
    //esto es una anotacion, y son funcionalidaddes adicionales//


    public ClaseAlta() {
    }

    public ClaseAlta(String nombre, Integer poderPelea, integer edad, String colorPelo) {
        super(nombre, poderPelea, edad, colorPelo);
    }

    @Override
    public void pelear() {
        System.out.println(this.getNombre()+"pelea con elegancia");


    }
}
