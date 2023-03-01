// https://leetcode.com/problems/pacific-atlantic-water-flow

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
       int[][] pacific = new int[matrix.length][matrix[0].length]; 
       int[][] atlantic = new int[matrix.length][matrix[0].length]; 
        
        if(matrix.length == 0){
            return new ArrayList<List<Integer>>();
        }
        // only need to call dfs on borders of oceans.
        
        
     // top and bottom borders 
    for(int col = 0 ; col < matrix[0].length;col++){
       dfs(matrix,0,col, Integer.MIN_VALUE, pacific);
       dfs(matrix,matrix.length-1,col,Integer.MIN_VALUE, atlantic); 
    } 
    // left and  right borders
        
        for(int row =0; row < matrix.length;row++){
            dfs(matrix,row,0,Integer.MIN_VALUE,pacific);
            dfs(matrix,row,matrix[0].length-1,Integer.MIN_VALUE,atlantic);
        }
        
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        // comapres pacific and atlantic and if 1 are matching it means a path exists between the two oceans, so add it to our linked list.
        for(int i = 0; i < matrix.length;  i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(pacific[i][j] == 1 && atlantic[i][j] == 1){
                    LinkedList<Integer> sol = new LinkedList<Integer>();
                    sol.add(i);
                    sol.add(j);
                    res.add(sol);
                }
            }
        }
        
        return res;
    }
    
    
    private static void dfs(int[][] grid,int row,int col, int prev, int[][] ocean){
        
        // Check Necessary Conditions 
        if(row < 0 || col < 0 || col > grid[0].length - 1 || row > grid.length-1){
            return;
        }
        else if(grid[row][col] < prev){
            return;
        }
        else if(ocean[row][col] == 1){
            return;
        }
        
        // Process Cell
        ocean[row][col] = 1;
        
        // Call dfs
        dfs(grid, row-1, col, grid[row][col], ocean);
        dfs(grid, row+1, col, grid[row][col], ocean);
        dfs(grid, row, col-1, grid[row][col], ocean);
        dfs(grid, row, col+1, grid[row][col], ocean);
        
        
    }
}