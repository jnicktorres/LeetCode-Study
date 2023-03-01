// https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int start = 0;
        int end = matrix.length-1;
        for(start = 0; start < matrix[0].length - 1;start++){
            if(target >= matrix[start][0] && target <= matrix[start][end]){
                for(int i = 0;i < matrix.length;i++){
                    if(matrix[start][i] == target){
                        return true;
                    }
                }
            }       
        }
        
        return false;
    }
}