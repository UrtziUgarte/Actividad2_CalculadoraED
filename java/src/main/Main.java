package main;
import java.util.Scanner;
/**
 * Clase que proporciona un menú para distintas operaciones.
 * @author Urtzi Ugarte
 * @author Inma Quilon
 * @see RestaUrtziUgarte
 * @see ProductoInmaQuilon
 */
public class Main {

    public static void main(String[] args) {
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
                    Suma.menu(); */
                case 'R':
                    RestaUrtziUgarte.menu();
                case 'P':
                    ProductoInmaQuilon.menu();
                case 'X':
                    System.out.println("Salir del programa");
                    break;
            }
        } while (opcion != 'X');
    }
}