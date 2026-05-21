class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] row : board){
            Arrays.fill(row, '.' );
        }

        solve(board,list,n,0);
        return list;
    }


    private static void solve(char[][] board, List<List<String>> list, int n,  int row){
        if(row == n){
            List<String> l = new ArrayList<>();
            for(int i = 0; i < n; i++) l.add(new String(board[i]));

            list.add(l);
            return;
        }

        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                solve(board,list,n,row+1);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col){
        for(int i=0;i<board.length;i++) {
            if(board[i][col] == 'Q') return false;
        }

        for(int i=0;i<board.length;i++) {
            if(board[row][i] == 'Q') return false;
        }
        
        for(int i=row, j=col ; i >= 0 && j<board.length ; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }

        for(int i=row, j=col ; i >= 0 && j >= 0 ; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
}
