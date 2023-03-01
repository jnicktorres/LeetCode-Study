// https://leetcode.com/problems/transpose-matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ret = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix.length;j++)
                matrix[i][j] = matrix[j][i];       
            }
        }
        
        return ret;
    
        
    }
}