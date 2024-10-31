package unidad3;

public class funciones {
    public static void imprimirVector(int[] vector){
        for (int j : vector) {
            System.out.print(j + " ");
        }
    }

    public static void imprimirMatriz(String[][] matriz){
        for (String[] i : matriz) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void imprimirMatriz(int[][] matriz){
        for (int[] i : matriz) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int enteroAleatorio(int max, int min){
        if (min > max) {
            throw new IllegalArgumentException("El valor mínimo no puede ser mayor que el valor máximo.");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] vectorAleatorio(int dimension, int max, int min){
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = enteroAleatorio(max, min);
        }
        return vector;
    }

    public static int promedioDeVector(int[] vector){
        int promedio = 0;
        for (int j : vector) {
            promedio += j;
        }
        return promedio/=vector.length;
    }

    public static int vectorPares(int[] vector){
        int cantidadDePares = 0;
        for (int j : vector) {
            if (j % 2 == 0) {
                cantidadDePares++;
            }
        }
        return cantidadDePares;
    }

    public static int sumaVector(int[] vector){
        int suma = 0;
        for (int j : vector) {
            suma += j;
        }
        return suma;
    }

    public static int[] sumaDeVectores(int[] vector1, int[] vector2){
        for(int i = 0;i<vector1.length;i++){
            vector1[i] += vector2[i];
        }
        return vector1;
    }

    public static int indiceDeVector(int[] vector, int numero){
        int indice = -1;
        for(int i = 0;i<vector.length;i++){
            if(vector[i] == numero){
                indice = i;
                break;
            }
        }
        return indice;
    }

    public static int[] invertirVector(int[] vector){
        int j = vector.length - 1;
        for(int i = 0;i < vector.length / 2;i++){
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
            j--;
        }
        return vector;
    }

    public static int[] ordenarVectores(int[] vector1, int[] vector2){
        //intente hacerlo con for pero se me iba el indice de os limites del vector, lo estaba pensando mal,
        //pense que el fot tenia como limite la dimesion del vectorOrdenado, pero es un while este dentro de los limites
        //y cuando se salga de los limites alguno, se cargan los indices que faltan de otro con los dos otros while
        int[] vectorOrdenado = new int[vector1.length + vector2.length];
        int i = 0, k = 0, j = 0;

        while (i < vector1.length && k < vector2.length) {
            if (vector1[i] < vector2[k]) {
                vectorOrdenado[j] = vector1[i];
                i++;
            } else {
                vectorOrdenado[j] = vector2[k];
                k++;
            }
            j++;
        }

        while (i < vector1.length) {
            vectorOrdenado[j] = vector1[i];
            i++;
            j++;
        }

        while (k < vector2.length) {
            vectorOrdenado[j] = vector2[k];
            k++;
            j++;
        }

        return vectorOrdenado;
    }

    public static int[][] generarMatriz(int filas, int columnas){
        if(filas < 1 || columnas < 1){
            throw new RuntimeException("Las numeros de filas y columnas para la matriz deben ser mayores a 1");
        }
        return new int[filas][columnas];
    }

    public static int[][] matrizAleatorio(int filas, int columnas, int max, int min){
        int[][] vector = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                vector[i][j] = enteroAleatorio(max, min);
            }
        }
        return vector;
    }

    public static int[][] escalarMatriz(int [][] matriz, int escalador){
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               matriz[i][j] *= escalador;
           }
        }
        return matriz;
    }

    public static int[][] matrizIentidad(int numero){
        if(numero < 1){
            throw new IllegalArgumentException("El numero no puede ser menor que 1");
        }
        int[][] matriz = new int[numero][numero];
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length; j >= 0; j--) {
                if(j == numero - 1){
                    matriz[i][j] = 1;
                    numero--;
                    break;
                }
            }
        }
        return matriz;
    }

    public static int[][] sumaDeMatrices(int[][] matriz1, int[][] matriz2){
        int[][] suma = new int[matriz1.length][matriz2[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;
    }

    public static int[][] obtenerFila(int[][] matriz, int fila){
        int [][] vectorDeFila = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == fila - 1){
                    vectorDeFila[i][j] = matriz[i][j];
                }
            }
        }
        return vectorDeFila;
    }

    public static int[][] obtenerColumna(int[][] matriz, int columna){
        int [][] matrizDeFila = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j == columna - 1){
                    matrizDeFila[i][j] = matriz[i][j];
                }
            }
        }
        return matrizDeFila;
    }

    public static int[] sumaDeFilas(int[][] matriz1){
        int[] suma = new int[matriz1.length];
        for (int[] ints : matriz1) {
            for (int j = 0; j < ints.length; j++) {
                suma[j] += ints[j];
            }
        }
        return suma;
    }

    public static int sumaDiagonalMatriz(int[][] matriz){
        if(matriz.length != matriz[0].length){
            return -1;
        }
        int suma = 0;
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j == k & i == k){
                    suma += matriz[i][j];
                    k++;
                }
            }
        }
        return suma;
    }

    public static int[][] transportarMatriz(int[][] matriz){
        int[][] matrizTransportada = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransportada[j][i] = matriz[i][j];
            }
        }
        return matrizTransportada;
    }

    public static int[][] productoDeMatrices(int[][] matriz1, int[][] matriz2){
        int[][] producto = new int[matriz1.length][matriz2[0].length];
        int[] vectorAux = new int[matriz1.length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz2[0].length; k++) {
                    vectorAux[k] = matriz1[j][k] * matriz2[k][i];
                }
                producto[j][i] = sumaVector(vectorAux);
            }
        }
        return producto;
    }

    public static int[][] matrizPiramidal(int numero){
        int[][] matriz = new int[numero][numero];
        int aux = numero;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero;
                numero--;
            }
            aux++;
            numero = aux;
        }
        return matriz;
    }

    public static int[] circleSort(int[] vector, int numero){
        int[] vectorAux = new int[vector.length];

        if(numero % vector.length == 0){
            return vector;
        } else if (numero > vector.length) {
            numero -= vector.length;
        }
        for (int i = 0; i < vector.length; i++) {
            if (i + numero >= vector.length) {
                vectorAux[i + numero - vector.length] = vector[i];
            }else {
                vectorAux[i + numero] = vector[i];
            }
        }
        return vectorAux;
    }
}