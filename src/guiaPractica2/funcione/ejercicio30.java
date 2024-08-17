package guiaPractica2.funcione;

import java.util.Scanner;
import static clase.teoria.funciones.deBinarioADecimal;

public class ejercicio30 {
    public static void main(String[] args) {
        System.out.println("Este programa transforma un número binario ingresado en decimal");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número binario y presione enter: ");
        int binario = scanner.nextInt();
        System.out.println("El número binario " + binario + " transformado a decimal es igual a: " + deBinarioADecimal(binario));
    }
}
