class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(per(board,i,j,0,word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean per(char[][] board, int i, int j, int index, String word){

        if(index == word.length()) return true;

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) return false;

        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = per(board,i+1,j,index+1,word)||
                        per(board,i-1,j,index+1,word)||
                        per(board,i,j+1,index+1,word)||
                        per(board,i,j-1,index+1,word);
        board[i][j] = temp;
        return found;
    }
}
