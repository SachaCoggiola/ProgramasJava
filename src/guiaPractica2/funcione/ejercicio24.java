package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.potencia;

public class ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Este es un programa que calcula la potencia de un número");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base y presione enter :");
        double base = scanner.nextDouble();
        System.out.print("ingrese el exponente y presione enter: ");
        int exponente = scanner.nextInt();
        System.out.println("El resultado de la potencia es: " + potencia(base,exponente));
    }
}
