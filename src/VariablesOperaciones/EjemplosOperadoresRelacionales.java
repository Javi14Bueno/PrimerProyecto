package VariablesOperaciones;

import java.util.Scanner;

public class EjemplosOperadoresRelacionales {
    public static void main(String[] args) {

        //Sirven para comparar dos números (normalmente) y dan como resultado un boolean

        int num1 = 35;
        int num2 = 23;

        num2 = num1; // estoy asignando a num2 el valor de num1

        boolean comparación = num2 ==num1; //estoy comparando los valores de num1 y el resultado (true) lo asigna a comparación

        boolean otraComparacion = num2 != num1;

        int nueve = 9;
        int otroNueve = 9;
        int diez = 10;
        System.out.println(nueve > otroNueve);
        System.out.println(nueve >= otroNueve);

        int edad = 18;
        System.out.println("¿Mayor de edad?" + (edad >= 18));
        System.out.println("¿Mayor de edad" + (edad >17));

        //== (igual a)
        //!= (distinto a)
        // >(mayor a)
       // >= (mayor o igual que)
       // < (menor que)
       // <= (menos o igual que)

        //Cuando aparecen operadores mezclados de distinto tipo:
        //Orden prioridad de la sintaxis


        //1º Parentesis
        //2º Incrementos y decrementos(++ y --)
        //3ºOperadores aritmeticos ( en el orden habitual : primero multiplicaciom, division, suma y resta)

        int num = 1000;
        boolean resultado = num + 10 > num + 9; //1010>1009


        int a = 5;
        int b = 6;
        int c = 7;

        //quiero saber si a <= b <= c

        //System.out.println(a <= b <= c);

        System.out.println(a <= b && b <= c);

        //EJEMPLo pedimos tres estaturas por teclado y queremos ver si están en orden ascendente

        Scanner sc = new Scanner(System.in);
        int estatura1 = sc.nextInt();
        int estatura2 = sc.nextInt();
        int estatura3 = sc.nextInt();

        boolean ordenDescente = estatura1 <= estatura2 && estatura2 <= estatura3;
        System.out.println("Ordeb ascendente :" + ordenDescente );

        //boolean ordenAscendente

        System.out.println("Orden ascendente:  " + (estatura1 > estatura2));





    }
}
