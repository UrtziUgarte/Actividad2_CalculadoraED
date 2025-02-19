package main;

import java.util.Scanner;

public class Main {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Que clase quieres hacer?");
            // System.out.println("Suma (S)");
            System.out.println("Resta (R)");
            System.out.println("Producto (P)");
            System.out.println("Salir (X)");

            opcion = sc.next().toUpperCase().charAt(0);
            switch (opcion) {
               /* case 'S':
                    Suma.menu();*/
                case 'R':
                    main.RestaUrtziUgarte.menu();
                case 'P':
                    main.ProductoInmaQuilon.menu();
                case 'X':
                    System.out.println("Salir del programa");
                    break;
            }
        } while (opcion != 'X');
    }
}