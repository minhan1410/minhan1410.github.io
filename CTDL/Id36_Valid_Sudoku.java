import java.util.LinkedHashSet;
import java.util.Set;

public class Id36_Valid_Sudoku {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][] { 
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, 
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' } 
        }));

        System.out.println(isValidSudoku(new char[][] {
            {'8','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}
        }));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new LinkedHashSet[9];
        Set<Character>[] col = new LinkedHashSet[9];
        Set<Character>[] square = new LinkedHashSet[9];

        for (int i = 0; i < 9; i++) {
            row[i] = new LinkedHashSet<Character>();
            col[i] = new LinkedHashSet<Character>();
            square[i] = new LinkedHashSet<Character>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!row[i].add(board[i][j])) {
                        return false;
                    }

                    if (!col[j].add(board[i][j])) {
                        return false;
                    }

                    if (!square[(i / 3) * 3 + j / 3].add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
