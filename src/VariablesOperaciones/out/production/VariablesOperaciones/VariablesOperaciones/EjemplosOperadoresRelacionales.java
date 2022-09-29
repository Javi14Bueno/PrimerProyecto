package VariablesOperaciones.out.production.VariablesOperaciones.VariablesOperaciones;

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
    }
}
