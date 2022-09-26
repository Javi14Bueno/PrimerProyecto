package VariablesOperaciones;

public class Ejercicio14 {
    public static void main(String[] args) {
        // 14. Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.

        //Formula es : 2 + pi * r
        double radio = 3;

        //NEW: El número pi lo podemos poner directamente como Math.PI

        double circunferencia = 2 * Math.PI * radio;
        System.out.println(circunferencia);

        //NEW Para mostrar un número de muchos decimales con sólo 2
        System.out.printf("La circunferencia es %.2f", circunferencia);

    }
}
