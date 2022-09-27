package VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio18 {
    //18. Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
    //visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:

    //Reamur = Centígrados x 0.8
    //Fahenheit = (Centígrados * 9/5)+32
    //Kelvin = Centígrados + 273
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué temperatura marca el termómetro?");
        double grados = sc.nextDouble();

        double reamur = grados * 0.8;
        double fahenheit = (grados * 9/5) +32;
        double kelvin = grados + 273;

        System.out.println(grados + " grados equivalen a: " + reamur + "grados reamur  " + fahenheit + "grados fahenheit y " + kelvin + " grados kelvin");
    }
}
