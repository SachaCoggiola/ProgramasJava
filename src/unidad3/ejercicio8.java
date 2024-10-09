package unidad3;

import static clase.teoria.funciones.enteroAleatorio;
import static teoria.funcionesArrays.vectorAleatorio;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int mayor = 0;
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) enteroAleatorio(7, 21);
            System.out.println(vector[i]);
            mayor = vector[0];
            mayor = Math.max(vector[i], mayor);
        }
        System.out.println("El número más grande del vector es: " + mayor);
    }
}
