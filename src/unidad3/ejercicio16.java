package unidad3;

import static unidad3.funciones.imprimirVector;
import static unidad3.funciones.vectorAleatorio;

public class ejercicio16 {
    public static int ventaCompraAcciones(int[] precios){
        int ganancia = 0;
        for (int j = precios.length - 1; j > 0; j--) {
            for (int i = j - 1; i >= 0; i--){
                if(ganancia < precios[j] - precios[i]){
                    ganancia = precios[j] - precios[i];
                }
            }
        }
        return ganancia;
    }

    public static void main(String[] args) {
        int[] vector = vectorAleatorio(10,15,1);
        imprimirVector(vector);
        System.out.println(" ");
        System.out.println(ventaCompraAcciones(vector));
    }
}
