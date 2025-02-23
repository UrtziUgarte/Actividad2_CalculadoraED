package main;

import java.util.Scanner;

/**
@author Sara Martinez
Usuario: Sara-Mart
Esta clase implementará todos los métodos que están relacionados con la suma de la calculadora.
*/
public class SumaSaraMartinez {
    private double valorAcumulado;
    public SumaSaraMartinez() {
        this.valorAcumulado= 0;
    }

    /**
     *SUMA DE DOS NUM REALES
     * @param a Primer numero de entrada: numero real
     * @param b Segundo numero de entrada: numero real
     * @return Resultado a+b
     */
    public static double sumaReales (double a, double b){
        return a+b;
    }

    /**
     *SUMA DE DOS NUM ENTEROS
     * @param a Primer numero de entrada: numero entero
     * @param b Segundo numero de entrada: numero entero
     * @return Resultado a+b
     */
    public static int sumaEnteros(int a, int b){
        return a+b;
    }

    /**
     *SUMA DE TRES NUM REALES
     * @param a Primer numero de entrada: numero real
     * @param b Segundo numero de entrada: numero real
     * @param c Segundo numero de entrada: numero real
     * @return Resultado a+b+c
     */
    public static double suma3Reales(double a, double b, double c){
        return a+b+c;
    }
    /**
     *SUMA CON VALOR ACUMULADO
     * @param num Numero de entrado
     * @return Valor acumulado
     */
    public double sumaValorAcumulado(double num){
        this.valorAcumulado += num;
        return this.valorAcumulado;
    }

    public double getValorAcumulado() {
        return this.valorAcumulado;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Que suma quieres realizar?");
            System.out.println("A: 5,20+2,23");
            System.out.println("B: 3+6");
            System.out.println("C: 2,2+8,85+6,78");
            System.out.println("D: Valor acumulado + 2,5");
            System.out.println("X: Salir de suma");

            opcion = sc.next().toUpperCase().charAt(0);
            switch (opcion) {
                case 'A':
                    System.out.println("Resultado: " + sumaReales(5.2, 2.3));
                    break;
                case 'B':
                    System.out.println("Resultado: " + sumaEnteros(3,6));
                    break;
                case 'C':
                    System.out.println("Resultado: " + suma3Reales(2.2,8.85,6.78));
                    break;
                case 'D':
                    System.out.println("Resultado: " + sumaValorAcumulado(2.5));
                    break;
                case 'X':
                    System.out.println("Salir de suma");
                    break;
            }
        } while (opcion != 'X');
    }
}
