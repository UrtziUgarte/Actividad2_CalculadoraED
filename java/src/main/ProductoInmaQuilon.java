package main;

import java.util.Scanner;

public class ProductoInmaQuilon {

    public static double reales(double real1, double real2) {
        return real1 * real2;
    }
    public static int enteros(int entero1, int entero2) {
        return entero1 * entero2;
    }
    public static double tresNumeros(double a, double b, double c) {
        return a*b*c;
    }
    public static double potencia(double base, double exp) {
        return Math.pow(base, exp);
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        char opcion;
        do{
            System.out.println("a. Multiplicar dos numeros reales");
            System.out.println("b. Multiplicar dos numeros enteros");
            System.out.println("c. Multiplicar tres numeros reales");
            System.out.println("d. Calcular la potencia");
            System.out.println("x. Salir");

            opcion = sc.next().toUpperCase().charAt(0);
            switch(opcion){
                case 'a':
                    System.out.println(ProductoInmaQuilon.reales(-1,3));
                    break;
                case 'b':
                    System.out.println(ProductoInmaQuilon.enteros(2,4));
                    break;
                case 'c':
                    System.out.println(ProductoInmaQuilon.tresNumeros(4,2,1));
                    break;
                case 'd':
                    System.out.println(ProductoInmaQuilon.potencia(4,2));
                    break;
            }
        }while (sc.nextInt() != 'X');
    }

}
