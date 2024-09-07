package guiaPractica2.entSalEstandar;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre y presione enter: ");
        String nombre = scanner.nextLine();
        System.out.println("Mi nombre es: " + nombre);
    }
}
