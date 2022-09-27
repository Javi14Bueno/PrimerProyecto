package VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        double base = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura)/2;

        System.out.println("El área del triangulo es: " + area);

    }
}
