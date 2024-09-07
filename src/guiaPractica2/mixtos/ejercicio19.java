package guiaPractica2.mixtos;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total of ten numbers to be returned the lowest number of all of them");
        System.out.println("Enter the first number");
        int lowestNumber = scanner.nextInt();
        if (lowestNumber < 0){
            throw new RuntimeException("The entered number must be a natural number");
        }
        for(int i = 2; i <= 15; i++){
            System.out.println("Enter the " + i + " number");
            int number = scanner.nextInt();
            if (number < 0){
                throw new RuntimeException("The entered number must be a natural number");
            }
            if(lowestNumber > number){
                lowestNumber = number;
            }
        }
        System.out.println("The lowest number of all entered numbers is " + lowestNumber);
    }
}
