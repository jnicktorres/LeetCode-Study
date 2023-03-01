// https://leetcode.com/problems/01-matrix

class Solution {
    
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList();
        int l = mat.length;
        int h = mat[0].length;
        
        for(int i =0; i < l;i++){
            for(int j = 0;j < h;j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i,j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int[] dir : dirs){
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                
                if(x < 0 || y < 0 || x > l-1 || y > h -1 || mat[x][y] != -1) continue;
                mat[x][y] = mat[cur[0]][cur[1]] + 1;
                q.offer(new int[]{x,y});
                
                
            }
            
            
        }
        
            return mat;
    }
}