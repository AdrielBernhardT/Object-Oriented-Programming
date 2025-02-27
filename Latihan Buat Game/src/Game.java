import java.util.Scanner;

public class Game {
    private static final int SIZE = 3;
    private static final char EMPTY = '-';
    private static final char PLAYER1 = 'O';
    private static final char PLAYER2 = 'X';
    private char[][] board;
    private boolean player1Turn;

    public Game() {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
        player1Turn = true;
        playGame();
    }

    private void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int moves = 0;

        while (!gameWon && moves < SIZE * SIZE) {
            printBoard();
            System.out.println("Player " + (player1Turn ? "1 (O)" : "2 (X)") + " move: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE || board[x][y] != EMPTY) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[x][y] = player1Turn ? PLAYER1 : PLAYER2;
            gameWon = checkWin(x, y);
            player1Turn = !player1Turn;
            moves++;
        }

        printBoard();
        if (gameWon) {
            System.out.println("Player " + (player1Turn ? "2 (X)" : "1 (O)") + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
        scanner.close();
    }

    private void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean checkWin(int x, int y) {
        char symbol = board[x][y];
        return (checkRow(x, symbol) || checkColumn(y, symbol) || checkDiagonals(symbol));
    }

    private boolean checkRow(int row, char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int col, char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] != symbol) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonals(char symbol) {
        boolean diagonal1 = true, diagonal2 = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != symbol) {
                diagonal1 = false;
            }
            if (board[i][SIZE - 1 - i] != symbol) {
                diagonal2 = false;
            }
        }
        return diagonal1 || diagonal2;
    }

    public static void main(String[] args) {
        new Game();
    }
}
