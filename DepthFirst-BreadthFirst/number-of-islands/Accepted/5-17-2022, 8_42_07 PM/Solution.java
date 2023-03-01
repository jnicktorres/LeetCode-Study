// https://leetcode.com/problems/number-of-islands

class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j <grid[0].length;j++){
                 if(grid[i][j] == '1'){
                     dfs(i,j,grid);
                     islands++;
                 }
            }
        }
        return islands;
        
    }
    
    
    private void dfs(int row, int col, char[][] grid){
        
        if(row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1){
            return;
        }
        
        if(grid[row][col] == '0'){
            
            return;
        }
        
        grid[row][col] = '0';
        
        dfs(row+1,col,grid);
        dfs(row-1,col,grid);
        dfs(row,col+1,grid);
        dfs(row,col-1,grid);
            
            
    }
}