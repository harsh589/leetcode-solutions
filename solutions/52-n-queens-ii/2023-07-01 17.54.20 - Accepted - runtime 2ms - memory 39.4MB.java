class Solution {
    private int count;

    public int totalNQueens(int n) {
        count = 0;
        int[] board = new int[n];
        placeQueens(board, 0);
        return count;
    }

    private void placeQueens(int[] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row] = col;
                placeQueens(board, row + 1);
            }
        }
    }

    private boolean isValid(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
