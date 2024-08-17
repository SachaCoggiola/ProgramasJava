package clase.teoria;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class funciones {
    public static String holaMundo(){
        return "Hola Mundo";
    }

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static boolean sonIguales(int num1, int num2){
        return (num1 - num2) <= 3 && (num2 - num1) <=3;
    }

    public static double potencia(double base, int exponente){
        int i = 1;
        double aux = base;
        if(exponente == 0){
            return 1;
        } else if (exponente < 0) {
            exponente = exponente * -1;
            while (i < exponente){
                base = base * aux;
                i = i + 1;
            }
            return 1/base;
        }else{
            while (i < exponente){
                base = base * aux;
                i = i + 1;
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

    public static int deBinarioADecimal(int binario){
        int deci = 0;
        String binStr = Integer.toString(binario); // Convertir el número binario a cadena
        for (int i = 0; i < binStr.length(); i++) {
            int bit = Character.getNumericValue(binStr.charAt(i));
            if(bit > 1 ^ bit < 0){
                throw new IllegalArgumentException("El número binario ingresado no puede contener numero que no sean 0 o 1 positivo, intente de nuevo");
            }
            deci = deci * 2 + bit;
        }
        return deci;
    }

    /* se puede utilizar esto para limitar el numero de decimales, no se si es necesario
    BigDecimal bd = new BigDecimal(number);
    bd = bd.setScale(2, RoundingMode.HALF_UP);
    System.out.println(bd.doubleValue());
     */

  /*  public static double raizCuadrada(int num){
        if (num < 0){
            throw new RuntimeException("El número ingresado debe igual o mayor a cero");
        }
        return pow(num,0.5);
    }
   */
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
}
