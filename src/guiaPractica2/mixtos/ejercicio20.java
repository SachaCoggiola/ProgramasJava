package guiaPractica2.mixtos;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total of ten numbers to be calculated the average between only the even numbers");
        int result = 0;
        int evenNumbersCounter = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Enter the " + i + " number");
            int number = scanner.nextInt();
            if(number % 2 == 0){
                result += number;
                evenNumbersCounter += 1;
            }
        }
        if (evenNumbersCounter > 0){
            result /= evenNumbersCounter;
            System.out.println("The average of the even numbers is " + result);
        }else{
            System.out.println("There are no even numbers so the average is " + result + " (zero)");
        }
    }
}
