package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.areaCirculo;

public class ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula el area de un circulo al ingresarle el radio del mismo");
        System.out.print("Ingrese el radio del circulo: ");
        Scanner scanner = new Scanner(System.in);
        float radio = scanner.nextFloat();
        System.out.println("EL area del circulo es: " + areaCirculo(radio) + " metros cuadrados");
    }
}
