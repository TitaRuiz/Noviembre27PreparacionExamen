package com.corenetworks.presentacion;

import com.corenetworks.modelo.MonedasEj1;

public class ProbarMonedaEj1 {
    public static void main(String[] args) {
        MonedasEj1 objmoneda = new MonedasEj1();
        System.out.println(objmoneda.cambioBilletes(200, 163.27F));

    }
}
