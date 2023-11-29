package com.corenetworks.presentacion;

public class Ejercicio1WH {
    public static void main(String[] args) {
        //Escribir el factorial del número 15-
        long factorial=1;
        int numero = 25;
        int i= 1;
        while ( i <= numero) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(" El factorial de 25 es  " + factorial);


    }
}
