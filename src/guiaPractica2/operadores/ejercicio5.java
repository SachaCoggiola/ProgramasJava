package guiaPractica2.operadores;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este es un programa que suma dos números");
        System.out.print("Ingrese el priemr número a sumar y presione enter: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número a sumar y presione enter: ");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
