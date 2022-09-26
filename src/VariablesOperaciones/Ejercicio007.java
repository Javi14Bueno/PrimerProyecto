package VariablesOperaciones;

import java.util.Scanner;

public class Ejercicio007 {
    public static void main(String[] args) {
        //7.Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
        //cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
        //minutos.
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();

        //Vamos a calcular cuantas horas y minutos corresponden a los introducidos

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        //mostrarlo por pantalla

        System.out.println(minutos + " minutos equivalen a "+ horas + "hora/s" + " y " + minutosRestantes + " minutos ");



    }
}
