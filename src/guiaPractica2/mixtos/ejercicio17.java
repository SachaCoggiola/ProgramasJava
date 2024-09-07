package guiaPractica2.mixtos;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total of ten numbers to be returned the greater of all of them");
        System.out.println("Enter the first number");
        int highNumber = scanner.nextInt();
        if(highNumber < 0){
            throw new RuntimeException("The entered number must be a natural number");
        }
        for(int i = 2; i <= 10; i++){
            System.out.println("Enter the " + i + " number");
            int number = scanner.nextInt();
            if (number < 0){
                throw new RuntimeException("The entered number must be a natural number");
            }
            if (highNumber < number){
                highNumber = number;
            }
        }
        System.out.println("The greater number of all entered numbers is " + highNumber);
    }
}
