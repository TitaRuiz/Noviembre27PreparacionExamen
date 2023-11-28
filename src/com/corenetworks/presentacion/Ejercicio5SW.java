package com.corenetworks.presentacion;

public class Ejercicio5SW {
    public static void main(String[] args) {


        String resultado = "";
        char num = 'V';
        switch (num) {
            case 'i','I':
                resultado = "Uno";
                break;
            case 'v','V':
                resultado = "Cinco";
                break;
            case 'x','X':
                resultado = "Diez";
                break;
            case 'l','L':
                resultado = "Cincuenta";
                break;
            case 'c','C':
                resultado = "Cien";
                break;
            case 'd','D':
                resultado = "Quinientos";
                break;
            case 'm','M':
                resultado = "Mil";
                break;
            default:
                resultado="Valor inválido";
                break;
        }
        System.out.println("resultado -> " + resultado);
    }

}
