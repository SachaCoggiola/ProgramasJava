package guiaPractica2.condicionales;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate the absolute value");
        int number = scanner.nextInt();
        int negativeNumber = -number;
        if (number >= 0){
            System.out.println("The absolute value of " + number + " is equal to |" + number + "|");
        }else {
            System.out.println("The absolute value of " + number + " is equal to |" + negativeNumber + "|");
        }
    }
}
