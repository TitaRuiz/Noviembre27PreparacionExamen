package com.corenetworks.modelo;

import java.util.Objects;

public class PersonaEj3 {

    private int edad;
    public int CalculaEdadDias()
    {
        return edad * 365;
    }
    public long CalculaEdadSegundos()
    {
        return edad * 365 * 24 * 60 * 60;
    }

    @Override
    public String toString() {
        return "PersonaEj3{" +
                "edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaEj3 that = (PersonaEj3) o;
        return edad == that.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad);
    }

    public PersonaEj3(int edad) {
        this.edad = edad;
    }public PersonaEj3() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
