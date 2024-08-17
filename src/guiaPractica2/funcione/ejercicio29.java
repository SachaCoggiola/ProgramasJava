package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.esPrimo;

public class ejercicio29 {
    public static void main(String[] args) {
        System.out.println("Este programa al ingresarle un número entero, devuelve si el mismo es un número primo o no.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número y presione enter: ");
        int num = scanner.nextInt();
        if (num <= 0){
            System.out.println("El número ingresado debe ser mayor a 0, intente de nuevo.");
        }else {
            if (esPrimo(num)) {
                System.out.println("El número ingresado es un número primo.");
            } else {
                System.out.println("El número ingresado NO es un número primo.");
            }
        }
    }
}
