package guiaPractica2.recursivas;

import java.util.Scanner;
import static clase.teoria.funciones.sumaDigitosRecursivo;

public class ejercicio35 {
    public static void main(String[] args) {
        System.out.println("Enter a number to return the sum of is digits as units");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("The sum of " + number + " digits is " + sumaDigitosRecursivo(number));
    }
}
