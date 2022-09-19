package ElementosBásicos;

public class LasVariables {
    public static void main(String[] args) {
        //Variables
        int a = 5; // Declaro la variable a y guardo en ella el valor 5
        System.out.println("La variable a vale " + a);
        // Su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println("La variable a vale " + 8);

        // Reglas para nombrar variables
        // int 0a = 5; (peta)

        //No puede comenzar por ningún digito
    //    No puede comenzar por ningun digito
    //    int 5c = 4; --< no compila
        //Puede contener cualquier letra o digito
        int c58 = 2;
        //No puede contener ningún caracter especial (signos de puntuación, . . .) a excepción de los caracteres _ y $
        int _variable = 3;
        int $otraVariable = 4;
        //No puede contener espacios
    //  int otra variable; --> no compila

        System.out.println("TIPOS DE VARIABLE");
        System.out.println("=================");
        System.out.println("Las variables se declara poniendo poniendo 1 el tipo de variable que es y 2 el nombre que le damos a la variable");
        System.out.println("Variables para números enteros: byte, short");
        System.out.println("byte");
        byte variableBytePos = 127; //es el número más grande que puedo guardar en una variable de tipo byte
        byte variableByteNeg = -128; // es el número más pequeño que puedo guardar en una variable byte
        System.out.println("VariableBytePos = " + variableBytePos);
        System.out.println("variableByteNeg = " + variableByteNeg);
        System.out.println("Números decimales: float o double");
        double decimal = 3.14;
        double número = 3;
        System.out.println(número);
        System.out.println(decimal);



    }
}
