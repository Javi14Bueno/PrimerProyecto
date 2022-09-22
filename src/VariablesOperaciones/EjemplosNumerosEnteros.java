package VariablesOperaciones;

import java.util.Scanner;

public class EjemplosNumerosEnteros {
    public static void main(String[] args) {
        //pedir por teclado dos números y guardarlos en dos variables de tipo entero
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número");
        int num1 = sc.nextInt();
        System.out.print("Segundo número");
        int num2 = sc.nextInt();

        //Crear variables que guarden el resultado de las cinco operaciones posibles
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int resto = num1 % num2;

        //Mostrar el resultado de cada operación
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);


    }
}
