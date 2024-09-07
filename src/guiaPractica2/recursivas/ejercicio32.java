package guiaPractica2.recursivas;

import static clase.teoria.funciones.factorialRecursivo;
import java.util.Scanner;

public class ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate his factorial");
        int number = scanner.nextInt();
        System.out.println("The factorial of " + number + " is " + factorialRecursivo(number));
    }
}
