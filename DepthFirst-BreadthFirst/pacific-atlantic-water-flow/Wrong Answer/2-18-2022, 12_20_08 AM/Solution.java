// https://leetcode.com/problems/pacific-atlantic-water-flow

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] grid) {
        ArrayList<List<Integer>> path = new  ArrayList<List<Integer>>();
        int[][] atlantic = new int[grid.length][grid[0].length];
        int[][] pacific = new int[grid.length][grid[0].length];
        
        //top and bottom
        
        for(int i = 0; i < grid[0].length;i++){
            dfs(grid,0,i,Integer.MIN_VALUE,pacific);
            dfs(grid,grid[0].length-1,i,Integer.MIN_VALUE,atlantic);            
        }
        
        // left and right
        for(int i = 0; i < grid.length;i++){
            dfs(grid,i,0,Integer.MIN_VALUE,pacific);
            dfs(grid,i,grid[0].length-1,Integer.MIN_VALUE,atlantic);            
        }
        
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(atlantic[i][j] == 1 && pacific[i][j] == 1){
                    LinkedList<Integer> sol = new LinkedList<Integer>();
                    sol.add(i);
                    sol.add(j);
                    path.add(sol);
                    
                }                
            }
        }
        
        return path;
        
    }
    
    
    
    
    
    private void dfs(int[][] grid ,int row, int col, int prev, int[][] ocean){
        if(row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length-1){
            return;
        }
        else if(grid[row][col] < prev){
            return;
        }
        else if(ocean[row][col] == 1){
            return;
        }
        ocean[row][col] = 1;
        
        dfs(grid,row+1 ,col, grid[row][col], ocean);
        dfs(grid,row-1 ,col, grid[row][col], ocean);
        dfs(grid,row,col+1, grid[row][col], ocean);
        dfs(grid,row,col-1, grid[row][col], ocean);       
    }
}