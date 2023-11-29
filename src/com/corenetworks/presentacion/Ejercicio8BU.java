package com.corenetworks.presentacion;

public class Ejercicio8BU {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            System.out.println("El número " + i);
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    System.out.println(" es divisible por " + j );
                }
            }
        }
    }
}
