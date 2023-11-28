package com.corenetworks.presentacion;

import com.corenetworks.modelo.Monedas;

public class ProbarMoneda {
    public static void main(String[] args) {
        Monedas objmoneda = new Monedas();
        System.out.println(objmoneda.cambioBilletes(200, 163.27F));

    }
}
