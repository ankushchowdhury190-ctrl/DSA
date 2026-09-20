class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i<n; i++){
            Arrays.fill(board[i], '.');
        }
        solve(board, 0, ans);
        return ans;
    }
    void solve (char[][] board, int row, List<List<String>> ans){
        if(row==board.length){
            List<String> list = new ArrayList<>();
            for (char[] r : board){
                list.add(new String(r));
                

            }
            ans.add(list);
            return;

        }
        for (int col= 0; col<board.length; col++){
            if(safe(board , row, col)){
                board[row][col] = 'Q';
                solve(board , row+1, ans);
                board[row][col]= '.';

            }
            
        }
    }
    boolean safe(char[][] board , int row, int col){
        // colume
        for(int i =0; i<row; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i =row-1, j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i =row-1, j=col+1 ; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;

            }
        }
        return true;

    }
}