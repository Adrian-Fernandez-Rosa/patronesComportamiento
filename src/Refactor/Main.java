package Refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    //    int[] numeros = {12, 23, -45, 1,9};
      //  imprimeMayorYmenor(numeros);

/*
        ConstructorLargo cosa = new ConstructorLargo
                ("a","b","c", 5);


 */
        //como se notara es muy largo y sin un ide
        // adecuado se olvidaria el orden de los parametros, se debería aplicar el patrón builder
/*
        ConstructorLargoBuilder cosa = new ConstructorLargoBuilder("marca")
                .conModel("b")
                .conMotor("electrico")
                .conPuertas(5);
*/
        esJavaenMacOS();
        System.out.println(System.getProperty("java.runtime.name"));
        System.out.println(System.getProperty("os.version"));
    }
        //técnica extrayendo variable
    public static boolean esJavaenMacOS(){
        boolean runtimeOracle = System.getProperty("java.runtime.name").contains("Runtime");
        boolean osVersion = System.getProperty("os.version").compareTo("10.0") == 0 ;

        if (runtimeOracle && osVersion){
            System.out.println("Es Oracle JVM en macOS 11.6");
            return true;
        }
        return false;
        /*
        if (System.getProperty("java.runtime.name").contains("Oracle")
        && System.getProperty("os.version").compareTo("11.6") == 0 ) {
            return true;
        }

         */

    }

    public boolean hoyEsDomingo(int numero) {
        boolean isDomingo =  numero == 7; //true o false
        if (isDomingo) {
            System.out.println(isDomingo);
        }
        return isDomingo;
    }



    public static void imprimeMayorYmenor(int []numeros) {
     /*
        int mayor = 0;
        int menor = numeros[0];

        for (int i : numeros){
            mayor = mayor < i ? i : mayor;
            menor = menor > i ? i : menor;
                    //Math.max(menor, numeros[i]);

        }*/
        //functional

        int mayor = Arrays.stream(numeros).reduce(0, (a, b) -> a > b ? a : b);

        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a < b ? a : b);

        System.out.println("Mayor: "+ mayor + " y menor: "+ menor);
    }

    public static int ifAnidado1() {
        int valor1 = 10;
        int valor2 = 10;

        if (valor1 > valor2){
            return valor1;
        }
            return valor2;

    }


}
