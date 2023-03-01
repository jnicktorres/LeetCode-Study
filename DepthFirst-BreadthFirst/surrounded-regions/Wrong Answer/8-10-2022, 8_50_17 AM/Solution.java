// https://leetcode.com/problems/surrounded-regions

class Solution {
    int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
    public void solve(char[][] board) {
        int h = board[0].length;
        int l = board.length;
        
        for(int i = 0; i < l; i++){
            for(int j = 0; j < h;j++){
                if(board[i][j] == 'O'){
                    dfs(board, i, j);
                }
            }
        }
        
        
    }
    
    public void dfs(char[][] board, int row, int col){
        if(row <= 0 || col <= 0 || row >= board.length - 1 || col >= board[0].length -1 || board[row][col] == 'X' ){
            
            return;
                                                                                                                   }       
        board[row][col] = 'X';
        
        
        for(int[] dir : dirs){
            int x = row + dir[0];
            int y = col + dir[1];
            dfs(board, x,y);       
        }   
           
           
           
    }
}