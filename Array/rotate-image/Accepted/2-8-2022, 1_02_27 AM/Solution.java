// https://leetcode.com/problems/rotate-image

class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        
        
        // This does the transpose, and it will rotate the inner diagonals and the outer diagonals;
        for(int i =0; i < n; i++){
            for(int j = i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }        
        }  
        
        
        // This is the second loop where it will finish the rotation
        
        for(int i =0; i < n; i++){
            for(int j=0; j < n/2; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n-1-j];
        matrix[i][n-1-j] = temp;
        }
    
        
}
}
}