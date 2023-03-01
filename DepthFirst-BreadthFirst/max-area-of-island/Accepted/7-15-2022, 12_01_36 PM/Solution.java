// https://leetcode.com/problems/max-area-of-island

class Solution {
    int running;
    public int maxAreaOfIsland(int[][] grid) {
       int max = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == 1){
                     running = 0;
                     int curr = dfs(i,j,grid);
                     max = Math.max(max, curr);                     
                }
            }
        }
        
        return max;
        
    }
    
    private int dfs(int row, int col, int[][] grid){
        if(row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length -1 || grid[row][col] == 0){
            return 0;
        }
        grid[row][col] = 0;
        running = running + 1;
        dfs(row + 1,col,grid);
        dfs(row - 1,col,grid);
        dfs(row,col + 1,grid);
        dfs(row,col - 1,grid);
        
        return running;
    }
}