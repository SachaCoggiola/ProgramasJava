package guiaPractica2.recursivas;

import java.util.Scanner;
import static clase.teoria.funciones.sumaNatural;

public class ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number to calculate the sum of all the previous numbers");
        int number = scanner.nextInt();
        System.out.println("The sum of all previous numbers to " + number + " is " + sumaNatural(number));
    }
}
