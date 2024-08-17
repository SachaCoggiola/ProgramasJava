package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.sumar;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa realiza la suma de dos números");
        System.out.print("Ingrese el primer número a sumar y presione enter: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número a sumar y presione enter: ");
        int num2 = scanner.nextInt();
        System.out.println("El resultado de la suma es: " + sumar(num1,num2));
    }
}
