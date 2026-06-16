
import java.util.*;

public class Sudoku {

    // Recursive function to solve sudoku
    public static boolean helper(int[][] board, int row, int col) {

        // Base Case:
        // If row becomes 9 → whole board solved
        if (row == board.length) {
            return true;
        }

        // Store next position
        int nrow = 0;
        int ncol = 0;

        // Move to next column
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        }

        // If last column → go to next row
        else {
            nrow = row + 1;
            ncol = 0;
        }

        // If current cell already has value
        // move directly to next cell
        if (board[row][col] != 0) {
            return helper(board, nrow, ncol);
        }

        // Try placing numbers from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {

            // Check if digit can be placed
            if (isSafe(board, row, col, digit)) {

                // Place digit
                board[row][col] = digit;

                // Recursively solve remaining cells
                if (helper(board, nrow, ncol)) {
                    return true;
                }

                // Backtracking:
                // remove placed digit
                board[row][col] = 0;
            }
        }

        // No valid number found
        return false;
    }


    // Check whether placing number is valid
    public static boolean isSafe(
            int[][] board,
            int row,
            int col,
            int number) {

        // Check entire column
        for (int i = 0; i < board.length; i++) {

            if (board[i][col] == number) {
                return false;
            }
        }

        // Check entire row
        for (int j = 0; j < board.length; j++) {

            if (board[row][j] == number) {
                return false;
            }
        }

        // Check inside 3×3 grid

        // Find starting row of grid
        int sr = (row / 3) * 3;

        // Find starting column of grid
        int sc = (col / 3) * 3;

        // Traverse grid
        for (int i = sr; i < sr + 3; i++) {

            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        // Safe to place
        return true;
    }


    // Print solved board
    public static void printBoard(int[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        // 0 means empty cell
        int[][] board = {

                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},

                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},

                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        // Solve sudoku
        if (helper(board, 0, 0)) {

            System.out.println("Solved Sudoku:");

            printBoard(board);

        } else {

            System.out.println("No solution exists");
        }
    }
}
