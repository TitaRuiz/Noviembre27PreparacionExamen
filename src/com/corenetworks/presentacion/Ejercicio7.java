package com.corenetworks.presentacion;

public class Ejercicio7 {
    public static void main(String[] args) {
        double capital = 1_000;
        double redito = 0;
        int tiempo = 70;

        if(tiempo <= 24){
            redito = 0.05;
        }else if(tiempo <=60){
            redito=0.8;
        }else {
            redito = 0.1;
        }
        System.out.println(capital*redito*tiempo);
    }
}
