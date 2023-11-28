package com.corenetworks.presentacion;

public class Ejercicio9 {
    public static void main(String[] args) {
        double sueldo = 12_000;
        double incremento = 0;
        char genero = 'M';
        int numhijos = 0;

        if(sueldo <15_000){
            incremento = 0.15;
        }else{
            incremento = 0.12;
        }
        if(genero=='M'){
            incremento += 0.02;
        }
        System.out.println("Incremento -> " + incremento);
        incremento =incremento+ (numhijos*0.01);

        System.out.println("El porcentaje de incremento -> " + incremento);
        System.out.println("El sueldo es -> " + sueldo*(1+incremento));
    }
}
