package guiaPractica2.entSalEstandar;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad y presione enter: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su altura en metros y presione enter: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese su nombre y presione enter: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("Mi nombre es " + nombre + " mido " + altura +  " metros, y tengo " + edad + " años ");
    }
}
