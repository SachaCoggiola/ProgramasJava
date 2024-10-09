package unidad3;

import java.util.Scanner;

import static unidad3.funciones.invertirVector;

public class ejercicio13 {
    public static int[] vectorAleatorio() {
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 100);
        }
        return vector;
    }
    public static void main(String[] args) {
        int[] vector = vectorAleatorio();
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                while (vector[i] == vector[j]) {
                    vector = vectorAleatorio();
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        vector = invertirVector(vector);
        System.out.println(" ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }
}
