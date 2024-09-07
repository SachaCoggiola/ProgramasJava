package guiaPractica2.operadores;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este es un programa que calcula el cociente de una división de dos números");
        System.out.print("Ingrese el denominador a sumar y presione enter: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el numerador número a sumar y presione enter: ");
        int num2 = scanner.nextInt();
        num2 /= num1;
        System.out.println("El cociente de la división es: " + num2);
    }
}
