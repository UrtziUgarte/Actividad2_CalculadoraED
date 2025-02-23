package main;

import java.util.Scanner;
/**
 * Clase que proporciona un menú para distintas operaciones.
 * @author Urtzi Ugarte
 * @author Inma Quilon
 * @author Sara Martinez
 * @see RestaUrtziUgarte
 * @see ProductoInmaQuilon
 * @see SumaSaraMartinez
 */
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Que clase quieres hacer?");
            System.out.println("Suma (S)");
            System.out.println("Resta (R)");
            System.out.println("Producto (P)");
            System.out.println("Salir (X)");

            opcion = sc.next().toUpperCase().charAt(0);
            switch (opcion) {
               case 'S':
                    main.SumaSaraMartinez.menu();
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