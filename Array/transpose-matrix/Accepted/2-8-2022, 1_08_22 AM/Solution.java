// https://leetcode.com/problems/transpose-matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int[][] mat = new int[columns][rows];
        
        
        for(int i = 0; i < rows;i++){
            for(int j =0; j < columns;j++){
              mat[j][i] = matrix[i][j];
                
            }
                        
        }
        return mat;
        
    }
}