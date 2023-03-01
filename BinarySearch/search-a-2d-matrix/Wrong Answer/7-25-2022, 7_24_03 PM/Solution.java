// https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
        
        
        int end = matrix.length-1;
        for(int start = 0; start < matrix.length;start++){
            if(target > matrix[start][0] && target <matrix[start][end]){
                for(int i = 1;i < matrix[0].length;i++){
                    if(matrix[start][i] == target){
                        return true;
                    }
                }
            }
              else if(target == matrix[start][0]){
                return true;
            }
            else if(target == matrix[start][end]){
                return true;
            }
        }
        
        return false;
    }
}