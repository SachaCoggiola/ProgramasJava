package unidad3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo el cual sera designado como dimesión del vector: ");
        int numero = sc.nextInt();
        if(numero < 1){
            throw new RuntimeException("El número ingresado debe ser un entero positivo");
        }
        int[] vector = new int[numero];
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i]);
        }
    }
}
