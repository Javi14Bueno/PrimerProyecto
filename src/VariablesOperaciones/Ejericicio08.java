package VariablesOperaciones;

import java.util.Scanner;

public class Ejericicio08 {
    public static void main(String[] args) {
        //8. Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
        //tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
        //son 3 horas, 30 minutos y 10 segundos.

        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();

        //calcular de este tiempo las horas, minutos y segundos

        int minutos = segundos / 60;
        int segundosRestantes =  segundos % 60;


        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println(segundos + " contienen " + horas + "hora/s" + " , " + minutosRestantes + "minutos y" + segundosRestantes + "segundos");




    }
}
