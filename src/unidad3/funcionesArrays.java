package unidad3;

import static clase.teoria.funciones.enteroAleatorio;

public class funcionesArrays {
    public static void imprimirVector(int[]vector){
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }

    public static void imprimirVectorln(int[]vector){
        for(int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }

    public static void vectorAleatorio(int numero, int min, int max){
        int[] vector = new int [numero];
        for(int i = 0; i < numero; i++){
            vector[i] = (int) enteroAleatorio(min, max);
            System.out.println(vector[i]);
        }
    }
}
