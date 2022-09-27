package VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio10 {
   // 10. Dado un número de dos dígitos, imprime su primer número (las decenas).
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Introduce un número de dos dígitos");
       int numero = sc.nextInt();

       //las decenas son el cociente
       System.out.println("Las decenas son: " + (numero / 10));
       System.out.println("... y las unidades, " + (numero % 10));
   }

}
