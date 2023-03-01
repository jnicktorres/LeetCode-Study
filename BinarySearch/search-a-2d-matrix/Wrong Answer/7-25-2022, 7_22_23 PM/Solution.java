// https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1 && matrix[0][0] == target){
            return true;
        }
        
        int start = 0;
        int end = matrix.length-1;
        for(start = 0; start < matrix.length - 1;start++){
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