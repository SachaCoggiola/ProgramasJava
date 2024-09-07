package clase.teoria;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.PI;

public class funciones {
    public static String holaMundo(){
        return "Hola Mundo";
    }

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static boolean sonIguales(int num1, int num2){
        return (num1 - num2) <= 0.00001 && (num2 - num1) <=0.00001;
    }

    public static double potencia(double base, int exponente){
        double aux = base;
        if(exponente == 0){
            return 1;
        } else if (exponente < 0) {
            exponente = exponente * -1;
            /*while (i < exponente){
                base = base * aux;
                i = i + 1;
            }*/
            for(int i = 1; i < exponente; i++){
                base = base * aux;
            }
            return 1/base;
        }else{
            for(int i = 1; i < exponente;i++){
                base = base * aux;
            }
            return base;
        }
    }

    public static double enteroAleatorio(int min, int max){
        if (min > max) {
            throw new IllegalArgumentException("El valor mínimo no puede ser mayor que el valor máximo.");
        }
        double random = Math.random(); // da un valor mayor o igual a 0.0 y menor 1.0
        random = random * (max - min + 1); // en el caso que de 0.0 queda 0.0 * (max - min + 1) = 0.0 + min = min
        random = random + min; // en el caso que sea 0.999999999999 queda 0.9 * (max - min + 1) = (max - min + 0.9) + min = max + 0.9
        return (int) random; // max + 0.9 el 0.9 se pierde al convertirse en int (para cualquier otro caso entre 0.0 y 0.99999 es lo mismo)
    }

    public static double areaCirculo(float radio){
       return potencia(radio,2) * PI;
    }

    public static boolean esPar(int num){
        return num % 2 == 0;
    }

    public static int max(int num1, int num2){
        return Math.max(num1, num2);
    }

    public static boolean esPrimo(int num){
        // Si el número es menor o igual a 1, no es primo
        if (num <= 1) {
            return false;
        }
        // Verificar la divisibilidad del número por cada número desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        // Si no se encontró ningún divisor, el número es primo
        return true;
    }
//corregir
    public static int deBinarioADecimal(int binario){
        int deci = 0;
        for (int i = 0; i < 10000; i++){
            deci = deci + (binario % 10 * (2 ^ i));
            binario = binario / 10;
            if(binario / 10 == 0){
                i = 10001;
            }
        }
        return deci;
    }

  /*  public static double raizCuadrada(int num){
        if (num < 0){
            throw new RuntimeException("El número ingresado debe igual o mayor a cero");
        }
        return pow(num,0.5);
    }*/

    public static double raizCuadrada(int num){
        double b = 1;
        double h = num;
        int i = 1;
        while( i < 10000){
            i = i + 1;
            b = (b + h) / 2;
            h = num/b;
        }
        // Lo saque de chatgpt
        BigDecimal bd = new BigDecimal(h);
        bd = bd.setScale(5, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static int factorialRecursivo(int number){
        if(number < 0){
            throw new RuntimeException("The entered number must be greater or equal to zero");
        }
        if(number > 1){
            return factorialRecursivo(number - 1) * number;
        }else {
            return 1;
        }
    }

    public static int sumaNatural(int number){
        if (number <= 0){
            throw new RuntimeException("The entered number must be greater than zero");
        }
        if(number > 1){
            return sumaNatural(number - 1) + number;
        }else {
            return 1;
        }
    }

    public static int fibonacciRecursivo(int number){
        if (number <= 0){
            throw new RuntimeException("The entered number must be greater than zero");
        }
        if (number > 2){
            return fibonacciRecursivo(number - 1) + fibonacciRecursivo(number - 2);
        }else{
            return 1;
        }
    }

    public static int sumaDigitosRecursivo(int number){
        if(number / 10 > 0){
            return sumaDigitosRecursivo(number / 10) + number % 10;
        }else{
            return number % 10;
        }
    }

    public static double potenciaRecursiva(double base, int exponente){
        if (exponente == 1){
            return base;
        }else if(exponente <= 0){
            return 1;
        }
        if (exponente > 2){
            return potenciaRecursiva(base,exponente - 1) * base;
        }else {
            return base * base;
        }
    }

    public static int sumaDeAntepasados(int numero){
        if(numero > 1){
            return sumaDeAntepasados(numero - 1) + numero;
        }else{
            return 1;
        }
    }

    public static int sumaDeAntepasadosNormal(int numero){
        for(int i = numero - 1;i > 0; i--){
            numero += i;
        }
        return numero;
    }

    public static boolean esPotencia(int numero, int base){
        while(base < numero){
            int aux = base;
            base *= aux;
        }
        return base == numero;
    }
}
