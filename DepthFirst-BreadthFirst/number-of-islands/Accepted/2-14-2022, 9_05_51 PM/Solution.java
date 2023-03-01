// https://leetcode.com/problems/number-of-islands

class Solution {
    public int numIslands(char[][] grid) {
       int islands = 0;
        for(int i  = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == '1'){
                dfs(grid,i,j);
                islands++;
                }
            }
        }
        
        return islands;
    }
    
    private static void dfs(char[][] grid,int row,int col){
        if(row<0 || col <0 || row > grid.length-1 || col > grid[0].length-1){
            return;
        }
        else if(grid[row][col] == '0'){
            return;
        }
        
        grid[row][col] = '0';
        
        dfs(grid,row + 1,col);
        dfs(grid,row - 1,col);
        dfs(grid,row,col + 1);
        dfs(grid,row,col - 1);
        
    }
}