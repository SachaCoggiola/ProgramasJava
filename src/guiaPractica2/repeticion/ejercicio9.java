package guiaPractica2.repeticion;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Este es un programa que imprime en pantalla las veces que desee el número 10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de veces que quiera que se imprima el número 10, y presione enter: ");
        int limite = scanner.nextInt();
        int i = 0;
        while(i < limite){
            i = i + 1;
            System.out.println(10);
        }
    }
}
