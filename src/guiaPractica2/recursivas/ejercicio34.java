package guiaPractica2.recursivas;

import java.util.Scanner;
import static clase.teoria.funciones.fibonacciRecursivo;

public class ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to return the fibonacci sequence equivalent number");
        int number = scanner.nextInt();
        System.out.println("The fibonacci sequence equivalent number to " + number + " is " + fibonacciRecursivo(number));
    }
}
