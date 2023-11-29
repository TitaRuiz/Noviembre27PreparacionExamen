package com.corenetworks.presentacion;

public class RepasoMetodosString {

    public static void main(String[] args) {
        String texto = "DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo " +
        "de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.";
        //Mostrar el numero de caracteres del texto anterior
        System.out.println(texto.length());

       // Mostrar la posicion de la primera palabra DevOps
        System.out.println("Posicion DevOps " + texto.indexOf("DevOps"));
        //Mostrar la posicion de la ultima palabra menos
        System.out.println("posicion ultima palabra menos -> " +texto.lastIndexOf("menos"));
        //Mostrar el texto en mayuscula
        System.out.println(texto.toUpperCase());
        //Mostrar el texto en minúscula
        System.out.println(texto.toLowerCase());
        //Extraer la primera palabra trabajo
        System.out.println(texto.indexOf("trabajo"));
        System.out.println(texto.indexOf("trabajo")+"trabajo".length());
        System.out.println("Extraer trabajo (" + texto.substring(texto.indexOf("trabajo"),texto.indexOf("trabajo")+"trabajo".length())+")");
    }
}
