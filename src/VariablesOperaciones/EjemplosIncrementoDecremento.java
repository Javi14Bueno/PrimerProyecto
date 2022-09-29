package VariablesOperaciones;

public class EjemplosIncrementoDecremento {
    public static void main(String[] args) {
        //      //Incremento y decremento
        //        //Útil cuando veamos bucles : for, while, do-while
        //        //Se utiliza cuando queremos que una variante aumente o disminuya
        //        //en una unidad

                int n = 10;
                System.out.println("1. " + n);
                //quiero aumentar una unidad
                n = n + 1;
                System.out.println("2. " + n);
                //esto mismo lo podría haber hecho así
                n++;
                System.out.println("3. " + n);
                //otra froma de escribir eso mismo
        n += 1; //esta nomenclatura vale también para el producto (n *= 1)etc...
        System.out.println("4. " + n);
        //y una opción más de escribir lo mismo (pero no es exactamente igual)
        ++n;
        System.out.println("5. " + n);

        // lo mismo para el decremento
        // si quiero que la variable disminuya en 1 unidad pueda hacerlo de dos formas
        n = n - 1;
        n--;
        n -= 1;
        --n;
        System.out.println("Decremento tras decremento");

        //Diferencia entre prefijo ++ o sufijo
        int a = 4;
        int b = a++;
        System.out.println("b: " + b);
        System.out.println(b++);
        System.out.println(a);

        int c = 10;
        System.out.println("c++ " + c++);
        System.out.println("c: " + c);
        System.out.println("++c: " + ++c);

    }
}
