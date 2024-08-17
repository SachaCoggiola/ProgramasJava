package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.esPar;

public class ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Este programa sirve para saber si un número es par o impar");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número el cual quiera saber si es par o impar, y presione enter: ");
        int num = scanner.nextInt();
        if (esPar(num)){
            System.out.println("El número ingresado es par");
        }else {
            System.out.println("El número ingresado es impar");
        }
    }
}
