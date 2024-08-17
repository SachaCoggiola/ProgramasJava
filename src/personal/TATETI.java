package personal;

import java.util.Scanner;

public class TATETI {
    public static void main(String[] args) {
        int[][] board = {{0,0,0},{0,0,0},{0,0,0}};
        boolean turnX = true;
        Scanner scanner = new Scanner(System.in);

        // Función para mostrar el tablero
        printBoard(board);

        for (int j = 1; j <= 9; j++) {
            System.out.println("Turno del jugador " + (turnX ? "X" : "O"));
            int position0, position1;

            // Solicitar y validar posición
            while (true) {
                System.out.print("Ingrese fila (0-2): ");
                position0 = scanner.nextInt();
                System.out.print("Ingrese columna (0-2): ");
                position1 = scanner.nextInt();

                if (position0 < 0 || position0 > 2 || position1 < 0 || position1 > 2) {
                    System.out.println("Posición inválida. Inténtelo de nuevo.");
                } else if (board[position0][position1] != 0) {
                    System.out.println("Posición ocupada. Inténtelo de nuevo.");
                } else {
                    break;
                }
            }

            // Actualizar el tablero
            board[position0][position1] = turnX ? 1 : 2;
            printBoard(board);

            // Verificar si hay un ganador
            if (checkWinner(board)) {
                System.out.println("El jugador " + (turnX ? "X" : "O") + " ha ganado!");
                return;
            }

            // Cambiar de turno
            turnX = !turnX;
        }

        System.out.println("Es un empate!");
    }

    // Función para imprimir el tablero
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                char symbol = cell == 1 ? 'X' : cell == 2 ? 'O' : '.';
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    // Función para verificar si hay un ganador
    public static boolean checkWinner(int[][] board) {
        for (int i = 0; i < 3; i++) {
            // Verificar filas y columnas
            if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != 0) ||
                    (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != 0)) {
                return true;
            }
        }
        // Verificar diagonales
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0) ||
                (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0)) {
            return true;
        }
        return false;
    }
}
