package com.corenetworks.presentacion;

public class Ejercicio4BU {
    public static void main(String[] args) {
        //Escribir el factorial del número 15-
        long factorial=1;
        int numero = 15;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println(" El factorial de 15 es  " + factorial);


    }
}
