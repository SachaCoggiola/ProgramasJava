package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.max;

public class ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Este programa devuelve el número más grande de los dos números ingresados");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número y presione enter: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número y presione enter: ");
        int num2 = scanner.nextInt();
        System.out.println("EL número más grande de los dos numeros ingresados previamente es: " + max(num1,num2));
    }
}
