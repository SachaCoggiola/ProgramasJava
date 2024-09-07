package guiaPractica2.condicionales;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to be a multiple");
        int multiple = scanner.nextInt();
        System.out.println("Enter a number to check if previous number is a multiple");
        int number = scanner.nextInt();
        if (multiple % number == 0){
            System.out.println("The first number is a multiple of the second number");
        }else{
            System.out.println("The first number is not a multiple of the second number");
        }
    }
}
