package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EjercicioJavaTime {

    public static void main(String[] args) {
        //Calcular la edad de una persona que nació el 3 de septiembre 1998
        Period edadP = Period.between(LocalDate.of(1998,9,3),LocalDate.now());
        System.out.println("Edad"+edadP.getYears());
        long edad = ChronoUnit.YEARS.between(LocalDate.of(1998,9,3),LocalDate.now());
        System.out.println("Edad " + edad);
        //Calcular la fecha de mañana
        System.out.println(LocalDate.now().plusDays(1));
        //Restar 3 meses a la fecha de final de curso 22 de marzo de 2024
        System.out.println(LocalDate.of(2024,3,15).minusMonths(3));
        //Calcular los dias desde el inicio del curso
        Period diasEstudiados = Period.between(LocalDate.of(2023,10,9),LocalDate.now());
        System.out.println(diasEstudiados.getDays());
        long diasTranscurridos = ChronoUnit.DAYS.between(LocalDate.of(2023,10,9), LocalDate.now());
        System.out.println("Dias transcurridos "+diasTranscurridos);

        //Duración del curso
        System.out.println(Period.between(LocalDate.of(2024,3,15),LocalDate.of(2023,10,9)));

    }
}
