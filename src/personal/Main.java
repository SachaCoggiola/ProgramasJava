package personal;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero: ");
        int number = scanner.nextInt();
        System.out.println("Usted ingresó el número: " + number);
        Main objetNumber = new Main();

        objetNumber.negative(number);

        objetNumber.even(number);

        objetNumber.absolut(number);

        if (number > 1){
            objetNumber.prime(number);
        }else {
            System.out.println("El número ingresado debe ser mayor a 1 (uno) para saber si es un número primo o no");
        }

        if (number > 0) {
            objetNumber.factorial(number);
            objetNumber.average(number, scanner); // Pass the scanner to the average method
        } else {
            System.out.println("No se puede calcular el promedio de cero números.");
            System.out.println("El número ingresado debe ser mayor a 0 (cero) para calcular su factorial");
        }

        scanner.close();

    }

    public void negative(int number){
        if (number < 0){
            System.out.println("El número que ha ingresado es negativo");
        } else if (number == 0) {
            System.out.println("El número que ha ingresado es cero");
        }else {
            System.out.println("El número que ha ingresado es positivo");
        }

    }

    public void even(int number){
        if (number % 2 == 0){
            System.out.println("El número que ha ingresado es par");
        }else{
            System.out.println("El número que ha ingresado es inpar");
        }
    }

    public void absolut(int number){
        if (number < 0){
            number = number * -1;
        }
        System.out.println("El valor absoluto del número que ha ingresado es: |" + number + "|");
    }

    public void average(int number, Scanner scanner){
        int i = 0;
        double result = 0;
        int x;
        while (i < number) {
            System.out.print("Por favor, ingresa un número entero para calcular el promedio de los mismos : " );
            System.out.println("Quedan " + (number - i) + " cantidad de números");
        x = scanner.nextInt();
            result = result + x;
            i = i + 1;
        }
        result = result / number;
        System.out.println("El promedio de los números ingresados es: " + result);
    }

    public void factorial(int number){
        int aux = 1;
        int facto = 1;
        while (aux <= number){
            facto = facto * aux;
            aux = aux + 1;
        }
        System.out.println("El factorial del número ingresado es: " + facto);
    }

    public void prime(int number){
        boolean isPrime = false;
        int numerador;

        int aux = 1;
        int facto = 1;

        while (aux < number){
            facto = facto * aux;
            aux = aux + 1;
        }

        numerador = facto + 1;

        if (numerador % number == 0){
            isPrime = true;
        }

        if (isPrime){
            System.out.println("El número ingresado es un número primo");
        }else {
            System.out.println("El número ingresado no es un número primo");
        }
    }
}