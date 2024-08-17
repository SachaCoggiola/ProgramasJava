package personal;

import java.util.Scanner;

public class Chess {
    public static class Pieces{
        public static void movement(int[][] board , char[][] notacion){
            boolean occupied = false;
            int position1,position2;
            int piecePosition1,piecePosition2;
            int piece;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese del 1 al 8, en que fila se encuentra la pieza que quiere mover");
            piecePosition1 = scanner.nextInt();
            System.out.println("Ingrese de la a hasta la h, en cual columna se encuentra la pieza que quiere mover");
            piecePosition2 = scanner.nextInt();
            piece = board[piecePosition1][piecePosition2];
            board[piecePosition1][piecePosition2] = 0;

            System.out.println("Ingrese del 1 al 8, a que fila quiere mover la pieza");
            position1 = scanner.nextInt();
            System.out.println("Ingrese de la a hasta la h, a que columna quiere mover la pieza");
            position2 = scanner.nextInt();
            if (board[position1][position2] >= 9 & board[position1][position2] <= 14 ){
                occupied = true;
            }
        }
    }

    public static void main(String[] args) {
        Pieces king = new Pieces();
        Pieces queen = new Pieces();
        Pieces rook = new Pieces();
        Pieces bishop = new Pieces();
        Pieces knight = new Pieces();
        Pieces pawn = new Pieces();
        char[][] notacion = {{' ','a','b','c','d','e','f','g','h'}};
        int[][] board = {
                {1,0,0,0,0,0,0,0,0},
                {2,0,0,0,0,0,0,0,0},
                {3,0,0,0,0,0,0,0,0},
                {4,0,0,0,0,0,0,0,0},
                {5,0,0,0,0,0,0,0,0},
                {6,0,0,0,0,0,0,0,0},
                {7,0,0,0,0,0,0,0,0},
                {8,0,0,0,0,0,0,0,0}
        };

        startGame(board,notacion);

    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
               if (cell > 0 & cell < 9){
                    System.out.print(cell + " ");
                }else{
                    char symbol = cell==9?'K': cell==10?'Q': cell==11?'R': cell==12?'B': cell==13?'N': cell==14?'P': '.';
                    System.out.print(symbol + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printNotacion(char[][] notacion){
        for(char[] row : notacion){
            for(char i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void startGame(int[][] board , char[][] notacion){
        System.out.println("!!!A new game has started¡¡¡");
        // Definir los valores y las posiciones
        int[] pieces = {11, 13, 12, 10, 9, 14};
        int[][] positions = {
                {0, 1, 0, 8, 7, 1, 7, 8}, // Torres (Rooks)
                {0, 2, 0, 7, 7, 2, 7, 7}, // Caballos (Knights)
                {0, 3, 0, 6, 7, 3, 7, 6}, // Alfiles (Bishops)
                {0, 4, 7, 4},             // Reyes (Kings)
                {0, 5, 7, 5},             // Reinas (Queens)
                {1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, // Peones (Pawns)
                        6, 1, 6, 2, 6, 3, 6, 4, 6, 5, 6, 6, 6, 7, 6, 8}
        };

        // Asignar valores a las posiciones
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < positions[i].length; j += 2) {
                board[positions[i][j]][positions[i][j + 1]] = pieces[i];
            }
        }

        printNotacion(notacion);
        printBoard(board);
    }
}
