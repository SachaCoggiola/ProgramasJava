package unidad3;

import static unidad3.funciones.imprimirVector;
import static unidad3.funciones.ordenarVectores;

public class ejercicio15 {
    public static void main(String[] args) {
        int[] vector1 = {1,2,4,6,8};
        int[] vector2 = {0,0,0,0,0};
        int[] vectorarMayor = new int[vector1.length + vector2.length];
        vectorarMayor = ordenarVectores(vector1, vector2);
        imprimirVector(vectorarMayor);
    }
}
