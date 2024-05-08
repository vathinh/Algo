package com.tvt.code.ds.matrix;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            if (!isValidColumn(board, j)) {
                return false;
            }
        }

        // Check sub-boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        boolean[] seen = new boolean[9];
        for (int j = 0; j < 9; j++) {
            char digit = board[row][j];
            if (digit != '.' && seen[digit - '1']) {
                return false;
            }
            if (digit != '.') {
                seen[digit - '1'] = true;
            }
        }
        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char digit = board[i][col];
            if (digit != '.' && seen[digit - '1']) {
                return false;
            }
            if (digit != '.') {
                seen[digit - '1'] = true;
            }
        }
        return true;
    }

    private static boolean isValidSubBox(char[][] board, int startRow, int startCol) {
        boolean[] seen = new boolean[9];
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char digit = board[i][j];
                if (digit != '.' && seen[digit - '1']) {
                    return false;
                }
                if (digit != '.') {
                    seen[digit - '1'] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board)); // Output: true
    }
}
