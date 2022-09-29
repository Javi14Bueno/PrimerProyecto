package VariablesOperaciones.out.production.VariablesOperaciones.VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio11 {
        //11. Dado un número de dos cifras, escribe un programa que permita obtener el número
        //  invertido. Ejemplo, si se introduce 23 que muestre 32.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un número de dos cifras");
            int numero = sc.nextInt();

            //extraemos las decenas
            int decenas = numero / 10;
            int unidades = numero %10;

            //lo mostramos al revés
            System.out.println(unidades + "" + decenas);
        }
}
