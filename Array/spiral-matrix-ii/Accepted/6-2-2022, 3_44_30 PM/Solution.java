// https://leetcode.com/problems/spiral-matrix-ii

class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] mat = new int[n][n];
        int curr = 1;
        int rowbeg = 0;
        int rowend = n-1;
        int colbeg = 0;
        int colend = n-1;
        
        
        while(curr <= n*n){
            
            //left to right
            for(int i = colbeg; i <= colend;i++){
                mat[rowbeg][i] = curr;
                curr++;
            }
            rowbeg++;
            System.out.print(curr);
            // top to bot
            for(int i = rowbeg;i <= rowend;i++){
                mat[i][colend] = curr;
                curr++;
            }
            System.out.print(curr);
            colend--;
            
            //right to left;
            for(int i = colend; i >=colbeg;i--){
                mat[rowend][i] = curr;
                curr++;
            }
            System.out.print(curr);
            rowend--;
            
            //bot to top
            for(int i = rowend; i >= rowbeg;i--){
                if (colbeg <= rowend){
                    mat[i][colbeg] = curr++; //change
            }
             
            }
            colbeg ++;
               
                
            }
            
        
        return mat;
    }
}