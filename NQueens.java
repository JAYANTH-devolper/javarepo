public class NQueens {
    final int N = 4;  // Set the size of the board (4x4 in this case)

    // Function to print the board configuration
    void printSolution(int board[][]) {
        for (int[] row : board) {
            for (int cell : row)
                // Print "Q" for queen and "." for empty space
                System.out.print((cell == 1 ? "Q " : ". "));
            System.out.println();
        }
    }

    // Function to check if it's safe to place a queen at board[row][col]
    boolean isSafe(int board[][], int row, int col) {
        // Check the column above the current cell
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        // If no threats found, it's safe
        return true;
    }

    // Recursive function to solve N-Queens using backtracking
    boolean solveNQueens(int board[][], int row) {
        // Base case: If all queens are placed
        if (row >= N)
            return true;

        // Try placing a queen in all columns of the current row
        for (int col = 0; col < N; col++) {
            // Check if it's safe to place the queen
            if (isSafe(board, row, col)) {
                // Place the queen
                board[row][col] = 1;

                // Recursively place the rest of the queens
                if (solveNQueens(board, row + 1))
                    return true;

                // If placing queen in board[row][col] doesn't lead to solution
                // then remove the queen (backtrack)
                board[row][col] = 0;
            }
        }

        // If queen can't be placed in any column in this row, return false
        return false;
    }

    // Driver function to start the process
    void solve() {
        // Initialize the board with 0s (empty cells)
        int[][] board = new int[N][N];

        // Start the backtracking algorithm from the first row
        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists.");
            return;
        }

        // Print the solution if found
        printSolution(board);
    }

    // Main method
    public static void main(String[] args) {
        new NQueens().solve();  // Create an instance and solve the problem
    }
}
