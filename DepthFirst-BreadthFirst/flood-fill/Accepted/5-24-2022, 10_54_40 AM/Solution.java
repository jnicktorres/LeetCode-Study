// https://leetcode.com/problems/flood-fill

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        //image[0][0] starting row, starting col
     dfs(image,sr,sc,newColor,image[sr][sc]);
        
        return image;
        
    }
    
    private void dfs(int[][] image, int row , int col, int newColor, int startingVal){
        if(row >= image.length || row < 0 || col >= image[0].length || col < 0 || newColor == startingVal || image[row][col] != startingVal){
            return;
        }
        
       
            image[row][col] = newColor;
        
        
        dfs(image,row+1,col,newColor,startingVal);
        dfs(image,row-1,col,newColor,startingVal);
        dfs(image,row,col+1,newColor,startingVal);
        dfs(image,row,col-1,newColor,startingVal);
        
    }
}