// https://leetcode.com/problems/k-closest-points-to-origin

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> q= new PriorityQueue<>(k,new Comparator<int[]>(){
        
        public int compare(int[] a, int[] b){
            return (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]);
        }
    });
        
        for(int[] point : points){
            q.add(point);
            
            if(q.size() > k){
                q.poll();
            }
        }
        
        return q.toArray(new int[0][0]);
        
        
    }
}