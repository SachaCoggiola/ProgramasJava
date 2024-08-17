package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.sonIguales;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa te dice si un número es igual a otro con una tolerancia de 3");
        System.out.print("Ingrese el primer número a igualar y presione enter: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número a igualar y presione enter: ");
        int num2 = scanner.nextInt();
        System.out.println(sonIguales(num1, num2));
    }
}
