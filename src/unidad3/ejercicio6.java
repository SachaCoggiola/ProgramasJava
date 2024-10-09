package unidad3;

import static teoria.funcionesArrays.imprimirVector;

public class ejercicio6 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int j = 10;
        for(int i = 0; i < vector.length; i++){
            vector[i] = j;
            j--;
        }
        imprimirVector(vector);
    }
}
