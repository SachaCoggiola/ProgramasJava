package guiaPractica2.repeticion;

import java.util.Scanner;

public class ejercicio10Y11 {
    public static void main(String[] args) {
        System.out.println("Este es un programa que calcula el promedio de tantos números como desee");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a calcular el promedio y presione enter: ");
        int totalDeNumeros = scanner.nextInt();
        if (totalDeNumeros == 1){
            throw new RuntimeException("El promedio de un número, es el mismo número");
        } else if (totalDeNumeros < 2) {
            throw new RuntimeException("El número debe ser mayor a 1 (uno), intente nuevamente");
        }
        int i = 0;
        double resultado = 0;
        while(i < totalDeNumeros){
            i = i +1;
            if(i == 1){
                System.out.println("Ingrese el primer número");
            }else {
                System.out.println("Ingrese el siguiente número del promedio");
            }
            int numeroIngresado = scanner.nextInt();
            resultado = resultado + numeroIngresado;
        }
        resultado = resultado / totalDeNumeros;
        System.out.println("El promedio de los numeros ingresados es: " + resultado);
    }
}
