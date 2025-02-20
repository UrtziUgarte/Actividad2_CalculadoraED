package main;
import java.util.Scanner;

/**
 * Clase que proporciona operaciones de tipo multiplicación.
 * @author Inma Quilon
 */
public class ProductoInmaQuilon {

    /**
     * Multiplica dos números reales y devuelve el resultado.
     * @param real1 es el primer numero a multiplicar
     * @param real2 es el segundo numero a multiplicar
     * @return La multiplicación de real1 y real2
     */
    public static double reales(double real1, double real2) {
        return real1 * real2;
    }


    /**
     * Multiplica dos números enteros y devuelve el resultado.
     * @param entero1 es el primer numero a multiplicar
     * @param entero2 es el segundo numero a multiplicar
     * @return La multiplicación de entero1 y entero2
     */
    public static int enteros(int entero1, int entero2) {
        return entero1 * entero2;
    }


    /**
     * Multiplica tres números reales y devuelve el resultado.
     * @param a es el primer numero a multiplicar
     * @param b es el segundo numero a multiplicar
     * @param c es el tercer numero a multiplicar
     * @return La multiplicación de a, b y c
     */
    public static double tresNumeros(double a, double b, double c) {
        return a*b*c;
    }


    /**
     * Cálcula la potencia de un número real.
     * @param base es el numero a calcular
     * @param exp es el exponente al que se va a elevar la base
     * @return La multiplicación de base por si mismo hasta el numero de veces del exponente
     */
    public static double potencia(double base, double exp) {
        return Math.pow(base, exp);
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        char opcion;
        do{
            System.out.println("A. Multiplicar dos numeros reales");
            System.out.println("B. Multiplicar dos numeros enteros");
            System.out.println("C. Multiplicar tres numeros reales");
            System.out.println("D. Calcular la potencia");
            System.out.println("X. Salir");

            opcion = sc.next().toUpperCase().charAt(0);
            switch(opcion){
                case 'A':
                    System.out.println("Introduce un numero");
                    double real1 = sc.nextDouble();
                    System.out.println("Introduce otro");
                    double real2 = sc.nextDouble();
                    System.out.println("Resultado: " + ProductoInmaQuilon.reales(real1, real2));
                    break;
                case 'B':
                    System.out.println("Introduce un numero");
                    int entero1 = sc.nextInt();
                    System.out.println("Introduce otro");
                    int entero2 = sc.nextInt();
                    System.out.println("Resultado: " + ProductoInmaQuilon.enteros(entero1, entero2) );
                    break;
                case 'C':
                    System.out.println("Introduce el primer numero");
                    double a = sc.nextDouble();
                    System.out.println("Introduce el segundo numero");
                    double b = sc.nextDouble();
                    System.out.println("Introduce el tercer numero");
                    double c = sc.nextDouble();
                    System.out.println("Resultado: " + ProductoInmaQuilon.tresNumeros(a, b, c));
                    break;
                case 'D':
                    System.out.println("Introduce la base");
                    double base = sc.nextDouble();
                    System.out.println("Introduce el exponente");
                    double exp = sc.nextDouble();
                    System.out.println("Resultado: " + ProductoInmaQuilon.potencia(base, exp));
                    break;
                case 'X':
                    System.out.println("Fin programa");
                    break;
            }
        }while (opcion != 'X');

        sc.close();

    }


    }

