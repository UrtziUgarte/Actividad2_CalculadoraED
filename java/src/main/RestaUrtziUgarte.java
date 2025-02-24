package main;

import java.util.Scanner;

/* Urtzi Ugarte Pampin
Usuario de GitHub: UrtziUgarte
*/
public class RestaUrtziUgarte {

    private static double valorAcumulado;

    public RestaUrtziUgarte() {
        this.valorAcumulado = 0;
    }

    /**
     *
     * @param a El primer parametro, numero real, de la resta
     * @param b El segundo parametro, numero real, de la resta
     * @return El resultado
     */
    public static double resta1(double a, double b){
        return a - b;
    }

    /**
     *
     * @param a El primer parametro, numero entero, de la resta
     * @param b El segundo parametro, numero entero, de la resta
     * @return El resultado
     */
    public static int resta2(int a, int b){
        return a - b;
    }

    /**
     *
     * @param a El primer parametro, numero real, de la resta
     * @param b El segundo parametro, numero real, de la resta
     * @param c El tercer parametro, numero real, de la resta
     * @return El resultado
     */
    public static double resta3(double a, double b, double c){
        return a - b - c;
    }

    public static double getValorAcumulado() {
        return valorAcumulado;
    }

    public static double restaValorAcumulado(double a) {
        return valorAcumulado -= a;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Que resta quieres hacer?");
            System.out.println("Opcion A: 7,42 - 4,34");
            System.out.println("Opcion B: 15 - 8");
            System.out.println("Opcion C: 5,64 - 2,43 - 2,65");
            System.out.println("Opcion D: Valor acumulado - 3,33");
            System.out.println("Opcion X: Salir del programa");

            opcion = sc.next().toUpperCase().charAt(0);
            switch (opcion) {
                case 'A':
                    System.out.println("Resultado: " + resta1(7.42, 4.34));
                    break;
                case 'B':
                    System.out.println("Resultado: " + resta2(15, 8));
                    break;
                case 'C':
                    System.out.println("Resultado: " + resta3(5.64, 2.43, 2.65));
                    break;
                case 'D':
                    System.out.println("Resultado: " + restaValorAcumulado(3.33));
                    break;
                case 'X':
                    System.out.println("Salir del programa");
                    break;
            }
        } while (opcion != 'X');
    }
}