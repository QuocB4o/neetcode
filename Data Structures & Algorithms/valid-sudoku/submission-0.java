class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];

        // Initialize HashSets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        // Traverse the board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {
                    continue;
                }

                char value = board[r][c];

                int squareIndex = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(value)
                        || cols[c].contains(value)
                        || squares[squareIndex].contains(value)) {

                    return false;
                }

                rows[r].add(value);
                cols[c].add(value);
                squares[squareIndex].add(value);
            }
        }

        return true;
    }
}