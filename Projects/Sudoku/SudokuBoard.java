
public class SudokuBoard {

    private int[][] board;

    // Constructor
    public SudokuBoard() {

        board = new int[][] {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
    }

    // Display Sudoku Board
    public void displayBoard() {

        System.out.println("+-------+-------+-------+");

        for (int i = 0; i < 9; i++) {

            System.out.print("| ");

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j] + " ");
                }

                if ((j + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }

            System.out.println();

            if ((i + 1) % 3 == 0) {
                System.out.println("+-------+-------+-------+");
            }
        }
    }
}
