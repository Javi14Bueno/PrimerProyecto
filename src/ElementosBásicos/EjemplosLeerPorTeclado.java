package ElementosBásicos;

import java.util.Scanner;

public class EjemplosLeerPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ahora ya podemos meter datos por teclado
        //Pero para poder utilizarlos después en el programa
        //Tenemos que guardarlos en una variable
        //Las variables que guardan palabras o cadenas de texto se llaman String
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine(); //escribo el nombre en el teclado y lo guardo en la variable nombre
        System.out.println("Hola, " + nombre);
        System.out.println("Introduce tu apellido");
        String apellido = sc.nextLine();
        System.out.println("Encantado señor, " + apellido);
        System.out.println("¿Cuántos años tienes? ");
        int edad = sc.nextInt();
        // Este método nextInt(), tiene un peligro: si a continuación pones un nextLine() se lo salta.
        // La manera de evitarlo es: cada vez que yo escribo nextInt(), si sé que luego voy a poner nextLine(), escribo un nextLine() adicional, sin más, de esta manera limpiamos el sc.
        sc.nextLine();
        System.out.println("Vaya... parece que no tienes acceso a esta página");
        System.out.println("¿Tienes mascota?");
        String mascota = sc.nextLine();
        System.out.println("Vale, espere un momento");

        //Vamos a meter un dato con decimales
        System.out.println("¿Y cuál es tu patrimonio?");
        double patrimonio = sc.nextDouble();
        System.out.println("!" + patrimonio + "!" + "Tiene usted derecho a reclamación");
        //Con los decimales: Cuando los escribimos en el código fuente: se pone .

        sc = new Scanner(System.in);
        //leo cinco palabras por teclado
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();
        String palabra4 = sc.nextLine();
        String palabra5 = sc.nextLine();
        //las escribo cada una en línea


    }
}
