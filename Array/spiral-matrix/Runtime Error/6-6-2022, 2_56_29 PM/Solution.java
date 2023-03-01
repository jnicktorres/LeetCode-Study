// https://leetcode.com/problems/spiral-matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> n = new ArrayList();
        int rowbeg = 0;
        int rowend = matrix[0].length - 1;
        int colbeg = 0;
        int colend = matrix.length-1;
        int c = 1;
        while(c <= matrix.length * matrix[0].length){
            
            for(int i = colbeg; i <= colend;i++){
                n.add(matrix[rowbeg][i]);
                c++;
            }
            rowbeg++;
            
            for(int i = rowbeg; i <= rowend;i++){
                n.add(matrix[i][colend]);
                c++;
            }
            colend--;
            for(int i = colend; i >= colbeg;i--){
                n.add(matrix[rowend][i]);
                c++;
            }
            rowend--;
            for(int i = rowend; i >= rowbeg;i--){
                n.add(matrix[i][colbeg]);
                c++;
            }
            colbeg++;
        }
        
        return n;
    }
}