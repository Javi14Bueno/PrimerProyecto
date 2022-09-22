package VariablesOperaciones;

import java.util.Scanner;

public class EjercicioOperaciones4 {
    public static void main(String[] args) {
        //4. Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
        //suma de los dos primeros y el producto del tercero y el cuarto.

        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número");
        int num1 = sc.nextInt();
        System.out.print("Segundo número");
        int num2 = sc.nextInt();
        System.out.print("Tercer número");
        int num3 = sc.nextInt();
        System.out.print("Cuarto número");
        int num4 = sc.nextInt();

        int suma = num1 + num2;
        int producto = num3 * num4;

        //resultados

        System.out.println( num1 + "+" + num2 + "=" + suma);
        System.out.println(num3 + "*" + num4 + "=" + producto);








    }
}
