package unidad3;

import static unidad3.funciones.matrizAleatorio;

public class ejercicio19 {
    public static void imprimirMatriz(int[][] matriz){
        for (int[] i : matriz) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        imprimirMatriz(matrizAleatorio(4,4,25,1));
    }
}
