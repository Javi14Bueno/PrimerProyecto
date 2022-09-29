package VariablesOperaciones;

public class EjemplosBoolean {
    public static void main(String[] args) {
        boolean apto = false;
        System.out.println("¿Es apto? " + apto);

        //Operadores lógicos
        //Unario: ! NOT

        System.out.println(!apto);
        System.out.println("---------");

        //Operadores binarios: se utilizan con 2 variables
        // AND y
        boolean v1 = true;
        boolean v2 = false;
        boolean and = v1 && v2;
        System.out.println(and);

        //OR o ||
        System.out.println("OR");
        boolean or = v1 || v2;
        System.out.println(or);

        // XOR ^
        System.out.println("XOR");
        boolean xor = v1 ^ v2;
        System.out.println(xor);



    }

}
