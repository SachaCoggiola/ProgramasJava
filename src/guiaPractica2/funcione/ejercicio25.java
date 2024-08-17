package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.enteroAleatorio;

public class ejercicio25 {
    public static void main(String[] args) {
        System.out.println("Este programa entrega un número entero aleatorio dentro de un rango determinado a elección");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número entero que defina el máximo: ");
        int max = scanner.nextInt();
        System.out.print("Ingrese el número entero que defina el mínimo: ");
        int min = scanner.nextInt();
        System.out.println("El número entero aleatorio generado por el programa es: " + enteroAleatorio(min,max));
    }
}
