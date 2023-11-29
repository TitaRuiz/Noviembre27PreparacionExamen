package com.corenetworks.presentacion;

public class Ejercicio5BU {
    public static void main(String[] args) {
        //Hallar 2 elevado a 8
        int exp = 1;

        for (int i = 1; i <= 8; i++) {
            exp = exp * 2;
            System.out.println("En la iteracion " + i + " -> " + exp);
        }

       // System.out.println(exp);

    }
}
