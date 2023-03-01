// https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            if(target > matrix[i][0] && target < matrix[i][n-1]){
                for(int j = 1; j < n; j++){
                    if(target == matrix[i][j]){
                        return true;
                    }
                }
            }
            else if(target == matrix[i][0]){
                return true;
            }
            else if(target == matrix[i][n-1]){
                return true;
            }
        }
        return false;
    }
}