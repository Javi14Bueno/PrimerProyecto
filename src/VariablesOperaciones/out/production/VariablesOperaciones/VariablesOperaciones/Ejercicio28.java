package VariablesOperaciones.out.production.VariablesOperaciones.VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio28 {
    //28.Escribe un programa que lea cuatro números por teclado

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

    //y decremento cada uno de ellos.
    //El programa debe mostrar los resultados en la misma línea, en el mismo órden que entraran, separados por espacios.
    // vamos a practicar con las distintas formas de decrementar.

        n3 -= 1; // porque esto así no lo puedo poner dentro del sout
        n4--;    // no lo pongo dentro del sout porque me imprimiría primero anres de incrementarse

        System.out.println((n1 - 1) + " " + --n2 + " " + n4);

    }
}
