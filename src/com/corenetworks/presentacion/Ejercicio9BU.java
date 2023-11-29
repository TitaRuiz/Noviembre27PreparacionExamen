package com.corenetworks.presentacion;

public class Ejercicio9BU {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            boolean primo= true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    primo=false;
                }
            }
            if(primo==true){
                System.out.println("Es primo el número " + i);
            }
        }
    }
}
