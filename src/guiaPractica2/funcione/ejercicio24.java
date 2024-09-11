package guiaPractica2.funcione;

import java.util.Scanner;

import static clase.teoria.funciones.*;

public class ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Este es un programa que calcula la potencia de un número");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base y presione enter :");
     //   double base = scanner.nextDouble();
        System.out.print("ingrese el exponente y presione enter: ");
     //   int exponente = scanner.nextInt();
        //System.out.println("El resultado de la potencia es: " + potencia(base,exponente));
        //System.out.println(potenciaRecursiva(base,exponente));
        System.out.println(sumaDeAntepasados(6));
        System.out.println(sumaDeAntepasadosNormal(6));
        System.out.println(esPotencia(2523,5));
        System.out.println(esPotenciaRecursiva(9,2));
        System.out.println(sumaDeAaB(3,5));
        System.out.println(sumaDigitosPares(1234));
        System.out.println(divisionRecursiva(8,3));
        System.out.println(sumaDeCuadrados(5));
        //System.out.println(logaritmoDeBaseDos(5,0.0001));
    }
}
