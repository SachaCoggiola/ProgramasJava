package unidad3;

import java.util.Scanner;

import static unidad3.funciones.imprimirMatriz;

public class ejercicio18 {
    public static int[][] generarMatriz(int filas, int columnas){
        if(filas < 1 || columnas < 1){
            throw new RuntimeException("Las numeros de filas y columnas para la matriz deben ser mayores a 1");
        }
        return new int[filas][columnas];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generador de matriz");
        System.out.println("Ingrese un número de filas para la matriz");
        int filas = sc.nextInt();
        System.out.println("Ingrese un número de columnas para la matriz");
        int columnas = sc.nextInt();
        imprimirMatriz(generarMatriz(filas,columnas));
    }
}
