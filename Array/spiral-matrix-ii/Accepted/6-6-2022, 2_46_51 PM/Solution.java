// https://leetcode.com/problems/spiral-matrix-ii

class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] mat = new int[n][n];
        int rowbeg = 0;
        int colbeg = 0;
        int rowend = n-1;
        int colend = n-1;
        int num = 1;
        
        while(num <= n*n){
            
            for(int i = colbeg; i <= colend;i++){
                mat[colbeg][i] = num++;
            }
            rowbeg++;
            
            for(int i = rowbeg; i <= rowend;i++){
                mat[i][colend] = num++;
            }
            colend--;
            
            for(int i = colend; i >= colbeg;i--){
                mat[rowend][i] = num++;
            }
            rowend--;
            
            for(int i = rowend; i >= rowbeg;i--){
                mat[i][colbeg] = num++;
            }
            colbeg++;
            
            
        }
        return mat;
        
    }
}