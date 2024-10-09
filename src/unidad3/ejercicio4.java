package unidad3;
import static teoria.funcionesArrays.imprimirVector;

public class ejercicio4 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for(int i = 0; i < vector.length; i++){
            vector[i] = i + 1;
        }
        imprimirVector(vector);
    }
}
