// https://leetcode.com/problems/pacific-atlantic-water-flow

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
         ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
         int[][] pacific = new int[heights.length][heights[0].length];
         int[][] atlantic = new int[heights.length][heights[0].length];
        //top and bottom
        for(int i = 0; i < heights[0].length; i++){
            dfs(heights,0,i,Integer.MIN_VALUE,pacific);
            dfs(heights,heights.length-1,i,Integer.MIN_VALUE,atlantic);
        }
        // left and right
        for(int i = 0; i < heights.length; i++){
            dfs(heights,i,0,Integer.MIN_VALUE,pacific);
            dfs(heights,i,heights.length-1,Integer.MIN_VALUE,atlantic);
        }
        for(int i = 0; i < heights.length;i++){
            for(int j = 0; j < heights[0].length;j++){
                if(pacific[i][j] == 1 && atlantic[i][j] ==1 ){
                    LinkedList<Integer> sol = new LinkedList<Integer>();
                    sol.add(i);
                    sol.add(j);
                    res.add(sol);
                }
            }
        }
        
        return res;
        
    }
    
    
    private void dfs(int[][] grid, int row, int col, int prev, int[][] ocean){
        if(row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1){
            return;
        }
        // we want to make sure that the curr number is less than prev
        else if(grid[row][col] < prev){
            return;
        }
        // mark 1 if pos is already visited in ocean
        else if(ocean[row][col] == 1){
            return;
        }
        ocean[row][col] = 1;
        dfs(grid,row+1,col,grid[row][col],ocean);
        dfs(grid,row-1,col,grid[row][col],ocean);
        dfs(grid,row,col+1,grid[row][col],ocean);
        dfs(grid,row,col-1,grid[row][col],ocean);
    }
}