package VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {


        //6. N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
        //programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
        //cuántas sobrarán tras el reparto.

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantas ardillas hay?");
        int n = sc.nextInt();
        System.out.print("¿Cuantas nueces hay?");
        int k = sc.nextInt();

        int cociente = k / n;
        int resto = k % n;

        System.out.println(k + "/" + n + "=" + cociente);



    }
}
