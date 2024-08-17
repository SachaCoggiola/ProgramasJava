package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.raizCuadrada;

public class ejercicio31 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula la raiz cuadrada de un número ingresado");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número entero al cual quiera calcular la raiz cuadrada y presione enter:");
        int num = scanner.nextInt();
        System.out.println("La raiz cuadrada de " + num + " es: " + raizCuadrada(num));
    }
}
