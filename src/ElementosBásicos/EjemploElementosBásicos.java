package ElementosBásicos;

import java.util.Scanner;

public class EjemploElementosBásicos {
    public static void main(String[] args) {
        System.out.println("HOLA");
        System.out.println("vamos a ver los números enteros");
        System.out.println(1_000_000_000);
        System.out.println("============");
        System.out.println("Caracteres");
        System.out.println("-----------");
        System.out.println("Los carácteres se representan mediante comillas");
        System.out.println("Por ejemplo: "  + 'a');
        System.out.println("Otro ejemplo: "  + '5');
        System.out.println("Tambíén puede ser un espacio en blanco" + ' ' + "  -.- ");


        System.out.println("\n\nCadena de caracteres");
        System.out.println("====================");
        System.out.println(123 + 2 + " 123");
        System.out.println(123 + 2 + "\t123");


        Scanner sc= new Scanner(System.in);
        //leo cinco palabras por teclado
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();
        String palabra4 = sc.nextLine();
        String palabra5 = sc.nextLine();
        //las escribo cada una en línea



    }
}


