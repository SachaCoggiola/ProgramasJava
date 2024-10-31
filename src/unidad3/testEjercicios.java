package unidad3;

import static unidad3.funciones.*;


public class testEjercicios {
    public static void main(String[] args) {
        imprimirMatriz(generarMatriz(3,4));
        System.out.println();
        imprimirMatriz(matrizAleatorio(3,3,100,1));
        System.out.println();
        imprimirMatriz(matrizIentidad(4));
        System.out.println();
        int[] vector = vectorAleatorio(4,9,0);
        int[][] matriz = matrizAleatorio(2,2, 5,1);
        int[][] matriz2 = matrizAleatorio(2,2, 5,1);
        imprimirMatriz(matriz);
        System.out.println();
        imprimirMatriz(matriz2);
        System.out.println();
        System.out.println();
        imprimirMatriz(sumaDeMatrices(matriz,matriz2));
        System.out.println();
        imprimirMatriz(obtenerFila(matrizIentidad(4), 2));
        System.out.println();
        imprimirMatriz(obtenerColumna(matrizAleatorio(4,4,7,2), 2));
        System.out.println();
        imprimirVector(sumaDeFilas(matrizAleatorio(4,4,1,1)));
        System.out.println();
        System.out.println();
        System.out.println(sumaDiagonalMatriz(matrizIentidad(7)));
        System.out.println();
        imprimirMatriz(transportarMatriz(matriz));
        System.out.println();
        imprimirMatriz(productoDeMatrices(matriz,matriz2));
        System.out.println();
        imprimirMatriz(matrizPiramidal(8));
        System.out.println();
        imprimirVector(vector);
        System.out.println();
        imprimirVector(circleSort(vector,4));
    }
}
