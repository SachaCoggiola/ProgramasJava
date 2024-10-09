package unidad3;
import static clase.teoria.funciones.enteroAleatorio;

public class vector {
    public static void imprimirVector(int numero){
        int[] vector = new int[numero];
        for(int i = 0; i < numero; i++){
            System.out.println(vector[i]);
        }
    }

    public static void vectorAleatorio(int numero, int max, int min){
        int[] vector = new int [numero];
        for(int i = 0; i < numero; i++){
            vector[i] = (int) enteroAleatorio(min, max);
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        imprimirVector(5);
        vectorAleatorio(6,8,2);
    }
}
