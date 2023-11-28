package com.corenetworks.presentacion;

public class Ejercicio2SW {
    public static void main(String[] args) {
        int nota=4;
        String resultado="";
        switch(nota){
            case 1:
            case 2:
            case 3:
            case 4:
                resultado="Suspenso";
                break;
            case 5:
            case 6:
                resultado="Suficiente";
                break;
            case 7:
            case 8:
                resultado="Bien";
                break;
            case 9:
            case 10:
                resultado="Notable";
                break;

        }

        System.out.println(resultado);
    }
}
