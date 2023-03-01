// https://leetcode.com/problems/word-search

class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        
        
        
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                if(board[i][j] == word.charAt(0) && dfs(0,word,board,i,j)){
                    return true;
                }
            }
        }
        
        return false;
        
        
    }
    
    private boolean dfs(int curr,String word, char[][] grid, int row, int col){
        if(curr == word.length()){
            return true;
        }
        if(row > grid.length-1 || col > grid[0].length-1 || row < 0 || col < 0 || visited[row][col] || grid[row][col] != word.charAt(curr)){
            return false;
        }
        visited[row][col] = true;
        
        if(dfs(curr+1,word,grid,row+1,col)|| dfs(curr+1,word,grid,row-1,col)|| dfs(curr+1,word,grid,row,col+1)||dfs(curr+1,word,grid,row,col-1)){
            return true;
        }

        visited[row][col] = false;
        return false;
        
        
    }
}