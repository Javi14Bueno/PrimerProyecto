package VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio16 {
    // 16. Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla el
    // perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
    // del lado por cuatro).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el lado del cuadrado");
        double lado = sc.nextInt();

        double perimetro = lado *4;
        System.out.println("El perímetro es " + perimetro + "cm ");
    }
}
