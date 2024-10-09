package unidad3;

import java.util.Scanner;

import static teoria.funcionesArrays.imprimirVector;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número el cual desea conocer la tabla de multiplicar: ");
        int numero = sc.nextInt();
        int[] vector = new int[11];
        for(int i = 0; i < vector.length; i++){
            vector[i] = numero * i;
        }
        System.out.println("La tabla de multiplicar del numero " + numero + " es:");
        for(int i = 0; i < vector.length; i++){
            System.out.println(numero + " x " + i + " = " + vector[i]);
        }
    }
}
