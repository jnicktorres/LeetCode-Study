// https://leetcode.com/problems/transpose-matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        
        for(int i = 0; i < n;i++){
            for(int j =i; j < n;j++){
              int temp = matrix[i][j];  
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
                
            }
                        
        }
        return matrix;
        
    }
}