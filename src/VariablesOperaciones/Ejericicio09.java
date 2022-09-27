package VariablesOperaciones;

import java.util.Scanner;

class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Momento inicial");
        System.out.println("---------------");
        System.out.println("Introduce la hora: ");
        int h1 = sc.nextInt();
        System.out.println("Introduce los minutos");
        int m1 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int s1 = sc.nextInt();
        System.out.println(" Hora: " + h1 + "h " + m1 + "' " + s1 +"'' am ");

        System.out.println("Momente final");
        System.out.println("-------------");
        System.out.println("Introduce la hora");
        int h2 = sc.nextInt();
        System.out.println("Introduce los minutos");
        int m2 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int s2 = sc.nextInt();
        System.out.println(" Hora: " + h2 + "h " + m2 + "' " + s2 +"'' pm ");

        int segundosMomentoInicial = (h1 * 3600) + (m1 * 60) + s1;
        int segundosMomentoFinal = (h2 * 3600) + (m2 * 60) + s2;

        int diferenciaTotal = segundosMomentoFinal - segundosMomentoInicial;

        int resultado1 = diferenciaTotal / 60; int resultado2= resultado1 * 60; int resultado3 = diferenciaTotal % 60;
        System.out.println("La diferencia de tiempo es: " + resultado1 + " h " + resultado2 + " ' " + resultado3 + " ''");









    }
}