package com.corenetworks.presentacion;

public class Ejercicio8 {
    public static void main(String[] args) {
        int num = 1;
        if(num%2==0 && num%3==0){
            System.out.println("Es par y multiplo de 3");
        }else if(num%2!=0 && num%3==0){
            System.out.println("Es impar y multiplo de 3");
        }else if(num%2==0 && num%3!=0){
            System.out.println("No es multiplo de 3 pero es par");
        }else {
            System.out.println("No es ni par ni multiplo de 3");
        }
    }
}
