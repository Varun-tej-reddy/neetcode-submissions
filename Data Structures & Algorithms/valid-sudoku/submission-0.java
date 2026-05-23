class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){

                    char temp = board[i][j];
                    board[i][j] = '.';
                    if(!isSafe(board,temp,i,j)) return false;
                    board[i][j] = temp;
                }
            }
        }
        return true;
    }

    private static boolean isSafe(char[][] board, char temp, int row, int col){
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == temp) return false;

            if(board[row][i] == temp) return false;

            if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == temp) return false;
        }

        return true;
    }
}
