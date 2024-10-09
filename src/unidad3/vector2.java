package unidad3;

import static unidad3.funciones.imprimirVector;

public class vector2 {
    public static int[] subvector(int[] vector, int indiceMenor, int indiceMayor){
        if(indiceMayor < 0 || indiceMenor < 0 || indiceMenor > vector.length || indiceMayor > vector.length){
            throw new RuntimeException("Los numeros de indices de vector deben de estar dentro de las dimensiones del mismo (0 a dimension)");
        }
        int[] subvector = new int[indiceMayor + 1 - indiceMenor];
        int j = indiceMenor;
        for(int i = 0; i < subvector.length; i++){
            subvector[i] = vector[j];
            j++;
        }
        return subvector;
    }

    public static boolean esta(int[] vector, int numero){
        for (int i : vector){
            if(numero == vector[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] vector = new int[20];
        int j = 0;
        for(int i = 0; i < 20; i++){
            vector[i] = j;
            j++;
        }
        imprimirVector(vector);
        System.out.println(" ");
        imprimirVector(subvector(vector,4,14));
        System.out.println(" ");
        System.out.println(esta(vector,56));
    }
}
